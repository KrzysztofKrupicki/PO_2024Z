package zad2;

import java.util.Objects;

public class Person {
    public String firstName;
    public String lastName;
    public static String nazwaUczelni = "UWM";

//    public Person(String firstName, String lastName) {
//        firstName = firstName;
//        lastName = lastName;
//    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String przedstawSie() {
        return "Nazywam się " + firstName + " " + lastName + ", studiuję na " + nazwaUczelni;
    }

    @Override
    public String toString() {
        return "Nazywam się " + firstName + " " + lastName + ", studiuję na " + nazwaUczelni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Adam", "Kowalski");
        Person p2 = new Person("Janina", "Kozłowska");
        Person p3 = new Person("Janina", "Kozłowska");
        System.out.println(p1.przedstawSie());
        Person.nazwaUczelni = "ART";
        System.out.println(p1.przedstawSie());
        System.out.println(p2.przedstawSie());
        System.out.println(p1);
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
        System.out.println(p2.hashCode() + " " + p3.hashCode());

    }

    // nie jest to mozliwe, bo przypisujemy argumentowi wartosc argumentu
}
