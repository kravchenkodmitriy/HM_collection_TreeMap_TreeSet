import java.util.Comparator;

public class PersonSurnameComaprator implements Comparator<Person> {
    private int amountWordSurname;


    public void setAmountWordSurname(int i) {
        this.amountWordSurname = amountWordSurname;
    }

    public int getAmountWordSurname() {
        return amountWordSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int lengthSurname1 = o1.getSurnname().split(" ").length;
        int lengthSurname2 = o2.getSurnname().split(" ").length;
        if (Math.min(lengthSurname1, amountWordSurname) != Math.min(lengthSurname2, amountWordSurname)) {
            return Integer.compare(lengthSurname1, lengthSurname2);
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
