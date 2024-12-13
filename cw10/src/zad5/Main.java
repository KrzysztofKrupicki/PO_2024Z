package zad5;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] produkty = {
                new Product("banan", 3.5, LocalDate.of(2023, 10, 3)),
                new Product("jabłko", 3.0, LocalDate.of(2023, 8, 13)),
                new Product("jogurt", 2.5, LocalDate.of(2024, 10, 16)),
                new Product("mleko", 4.5, LocalDate.of(2023, 10, 23)),
                new Product("masło", 8.5, LocalDate.of(2024, 6, 17))
        };
        for (int i = 0; i < produkty.length; i++) {
            System.out.println(produkty[i]);
        }
        Arrays.sort(produkty, new DataWaznosciComparator());
        System.out.println();
        for (int i = 0; i < produkty.length; i++) {
            System.out.println(produkty[i]);
        }
    }
}
