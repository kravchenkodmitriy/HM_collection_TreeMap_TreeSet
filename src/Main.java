import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Лолита", "Милявская", 50));
        list.add(new Person("Наталя", "Орхидеева", 65));
        list.add(new Person("Василий","Долгоруков-Крымский", 60));
        list.add(new Person("Михаил", "Голенищев-Кутузов-Смоленский", 63));
        list.add(new Person("Петр", "Семёнов-Тян-Шанский-Виленский", 70));

       PersonSurnameComaprator personSurnameComaprator = new PersonSurnameComaprator();
       personSurnameComaprator.setAmountWordSurname(2);
       Collections.sort(list, personSurnameComaprator);
        System.out.println(list);
    }
}
