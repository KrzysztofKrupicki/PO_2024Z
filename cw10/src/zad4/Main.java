package zad4;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pracownik[] pracownicy = {
                new Pracownik("Jan", 4600.00, LocalDate.of(2023, 10, 3)),
                new Pracownik("Adam", 6700.00, LocalDate.of(2023, 8, 13)),
                new Pracownik("Jola", 3300.00, LocalDate.of(2024, 10, 16)),
                new Pracownik("Tomek", 5800.00, LocalDate.of(2023, 10, 23)),
                new Pracownik("Andrzej", 5400.00, LocalDate.of(2024, 6, 17))
        };
        for (int i = 0; i < pracownicy.length; i++) {
            System.out.println(pracownicy[i]);
        }
        Arrays.sort(pracownicy, new PensjaComparator());
        System.out.println();
        for (int i = 0; i < pracownicy.length; i++) {
            System.out.println(pracownicy[i]);
        }
    }
}
