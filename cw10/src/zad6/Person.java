package zad6;

import zad5.Product;

import java.time.LocalDate;
import java.util.Comparator;

public class Person {
    String firstName;
    String lastName;
    LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " " + getBirthDate();
    }
}

class LastNameComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return CharSequence.compare(o1.getLastName(), o2.getLastName());
    }
}

class BirthDateComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}