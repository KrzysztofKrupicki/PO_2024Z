package cw3.zad1;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();

        Book b2 = new Book("1984", "George Orwell", 1999);
        System.out.println(b1.title);
        System.out.println(b2.title);
    }
}
