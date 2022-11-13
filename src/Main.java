import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Лолита", "Милявская", 50));
        list.add(new Person("Наталя", "Орхидеева", 65));
        list.add(new Person("Василий","Долгоруков-Крымский", 60));
        list.add(new Person("Михаил", "Голенищев-Кутузов-Смоленский", 63));
        list.add(new Person("Петр", "Семёнов-Тян-Шанский-Виленский", 70));
        list.add(new Person("Иван", "Семёнов-Тян-Шан", 11));
        list.add(new Person("Шаман", "Семёнов-Тян-Шан", 17));

        Predicate<Person> isYoung = person -> person.getAge() < 18;
        list.removeIf(isYoung);
        System.out.println(list);
    }
}
