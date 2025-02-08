package K11_alg;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Book> books = new ArrayList<>();
        books.add(new Book("Imagine", 360));
        books.add(new Book("Imagine", 400));
        books.add(new Book("Java", 240));
        books.add(new Book("Imagine", 240));
        System.out.println(findMax(books));
    }

    public static <T extends Comparable<T>> T findMax(Collection<T> items) {
        if (items.size() == 0 || items == null) {
            throw new IllegalArgumentException("Kolekcja nie moze byc pusta lub null");
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
