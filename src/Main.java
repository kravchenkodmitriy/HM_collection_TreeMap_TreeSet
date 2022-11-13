import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Лолита", "Милявская", 50));
        list.add(new Person("Наталя", "Орхидеева", 65));
        list.add(new Person("Василий","Долгоруков-Крымский", 60));
        list.add(new Person("Михаил", "Голенищев-Кутузов-Смоленский", 63));
        list.add(new Person("Петр", "Семёнов-Тян-Шанский-Виленский", 70));

        Comparator<Person> personSurnameComparatorNew = (o1, o2) -> {
            if (Math.min(o1.getSurnname().split(" ").length, 2) != (Math.min(o2.getSurnname().split(" ").length, 2))){
                return Integer.compare(o1.getSurnname().split(" ").length, o2.getSurnname().split(" ").length);
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        };
        list.sort(personSurnameComparatorNew);
        System.out.println(list);
    }
}
