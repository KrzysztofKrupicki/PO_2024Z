package cw4.zad3;

import java.util.Objects;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        if (firstName == null || firstName.equals("")) this.firstName = "---";
        else this.firstName = firstName;
        if (lastName == null || lastName.equals("")) this.firstName = "---";
        else this.lastName = lastName;
        if (age < 0) this.age = 0;
        else this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + ", Age: " + age + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
