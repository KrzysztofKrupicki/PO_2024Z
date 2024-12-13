package zad3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item[] items = {
                new Item("klawiatura", 0.45, 49.9),
                new Item("monitor", 1.45, 499.9),
                new Item("procesor", 0.04, 1999.9),
                new Item("myszka", 0.110, 99.9)
        };

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        Arrays.sort(items);
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(items[i]);
        }
    }
}
