public class Person implements Comparable<Person> {
    private String name;
    private String surnname;
    private int age;

    public Person(String name, String surnname, int age) {
        this.name = name;
        this.surnname = surnname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurnname(String surnname) {
        this.surnname = surnname;
    }

    public String getSurnname() {
        return surnname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        if (surnname.length() > o.surnname.length()) {
            return 1;
        } else if (surnname.length() < o.surnname.length()) {
            return -1;
        } else {
            return Integer.compare(age, o.age);
        }
    }

    @Override
    public String toString() {
        return name + " " + surnname + " " + age + " ";
    }
}
