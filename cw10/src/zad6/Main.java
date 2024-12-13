package zad6;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Jan", "Adamczyk", LocalDate.of(1998, 10, 23)),
                new Person("Andrzej", "Kowalski", LocalDate.of(1987, 7, 28)),
                new Person("Robert", "Nowak", LocalDate.of(1981, 6, 14)),
                new Person("Anna", "Nowak", LocalDate.of(1976, 4, 11)),
                new Person("Adam", "Małysz", LocalDate.of(1981, 6, 14))
        };

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        System.out.println();
        Arrays.sort(people, new LastNameComparator().thenComparing(new BirthDateComparator()));
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
