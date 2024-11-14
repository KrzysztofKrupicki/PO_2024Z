package cw6.zad0;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jan", 5);
        Person p3 = new Person("Jan", 5);
        System.out.println(p1.imie() + " " + p1.wiek());
        Person p2 = new Person("Andrzej");
        System.out.println(p2.imie() + " " + p2.wiek());
        System.out.println(p2);
        System.out.println(p3.equals(p1));
        p2.przedstawSie();
    }
}