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
        int comparator = Integer.compare(o2.getSurnname().length(), o1.getSurnname().length());
        if (comparator != 0) {
            if (o1.getSurnname().length() > getAmountWordSurname() && o2.getSurnname().length() > getAmountWordSurname()) {
                return Integer.compare(o2.getAge(),o1.getAge());
            } else {
                return comparator;
            }
        } else {

            return Integer.compare(o2.getAge(), o1.getAge());
        }
//        int lengthSurname1 = o1.getSurnname().split(" ").length;
//        int lengthSurname2 = o2.getSurnname().split(" ").length;
//        if ((lengthSurname1 >= amountWordSurname) != (lengthSurname2 >= amountWordSurname)) {
//            return Integer.compare(lengthSurname1, lengthSurname2);
//        }
//        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
