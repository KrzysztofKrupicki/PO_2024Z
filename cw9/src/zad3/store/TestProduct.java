package zad3.store;

import zad3.Book;
import zad3.Clothing;

public class TestProduct {
    public static void main(String[] args) {
        Product[] products = {
                new Book(),
                new Clothing(),
                new Book(),
                new Clothing(),
                new Clothing()
        };

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getPrice());
        }
    }
}
