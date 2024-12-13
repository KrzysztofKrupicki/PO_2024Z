package zad2;

public class Product {
    public static int numberOfProducts = 0;
    final static int MAX_PRODUCTS = 3;

    public Product() {
        numberOfProducts++;
        if (numberOfProducts > MAX_PRODUCTS) {
            System.out.println("Przekroczono maksymalną liczbę produktów.");
            numberOfProducts = MAX_PRODUCTS;
        }
    }
}
