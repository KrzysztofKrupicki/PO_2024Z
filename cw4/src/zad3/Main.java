package zad3;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(null, "Kowalski", -9);
        Person p2 = new Person(null, "Kowalski", -9);
        Person p3 = new Person("Jan", "Kowalski", 19);
        System.out.println(p1);
        System.out.println(p2.equals(p3));
    }
}
