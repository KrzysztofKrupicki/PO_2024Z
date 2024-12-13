package zad9;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Samsung", new Date(2024-1900, 9, 14));
        Smartphone s2 = s1.clone();
        s1.setProductionDate(new Date(2024-1900, 10, 12));
        System.out.println(s1);
        System.out.println(s2);
    }
}
