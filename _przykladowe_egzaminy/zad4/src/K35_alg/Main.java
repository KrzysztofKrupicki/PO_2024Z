package K35_alg;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Book> books = new ArrayList<>();
        books.add(new Book("Java", 456));
        books.add(new Book("World", 255));
        books.add(new Book("1984", 682));
        books.add(new Book("Imagine", 231));
        System.out.println(findMax(books));
    }

    public static <T extends Comparable<T>> T findMax(Collection<T> items) {
        if (items.isEmpty() || items == null) {
            throw new IllegalArgumentException("Argument nie moze byc pusty lub null");
        }
        T max = null;
        for (T item : items) {
            if (max == null || item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
