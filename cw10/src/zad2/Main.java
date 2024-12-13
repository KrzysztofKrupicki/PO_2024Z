package zad2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("zeszyt", 4, 1.99));
        orders.add(new Order("teczka", 2, 11.99));
        orders.add(new Order("długopis", 20, 1.99));
        orders.add(new Order("linijka", 7, 3.99));

        System.out.println(orders);
        Collections.sort(orders);
        System.out.println(orders);
    }
}
