package zad7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("Dell", "unknown", null);
        Laptop l1 = new Laptop("Asus", "Vivobook S15", null, 3.5);
        Desktop d1 = new Desktop("x-kom", "G4M3R", null, "tower");
        System.out.println(c1);
        System.out.println(c1.getManufacturer());
        System.out.println(l1);
        System.out.println(l1.getWeight());
        ArrayList<Double> list = new ArrayList<>();
        list.add(0, 939.99);
        list.add(1, 479.99);
        list.add(2, 199.49);
        d1.setPartsPrices(list);
        System.out.println(d1);
    }
}
