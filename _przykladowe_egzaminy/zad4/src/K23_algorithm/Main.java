package K23_algorithm;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Book> set1 = new HashSet<>();
        set1.add(new Book("Imagine", "Author"));
        set1.add(new Book("1984", "Author"));
        set1.add(new Book("Java", "Author"));
        HashSet<Book> set2 = new HashSet<>();
        set2.add(new Book("Imagine", "Author"));
        set2.add(new Book("World", "Author"));
        set2.add(new Book("Java", "Author"));
        set2.add(new Book("Hello", "Author"));
        set2.add(new Book("1984", "Author"));
        System.out.println(isSubset(set1, set2));

    }

    public static <E> boolean isSubset(HashSet<E> set1, HashSet<E> set2) {
        if (set1.isEmpty() || set2.isEmpty() || set1 == null || set2 == null) {
            throw new IllegalArgumentException("Argumenty nie mogą być puste lub null");
        }
        for (E item : set1) {
            if (!set2.contains(item)) {
                return false;
            }
        }
        return true;
    }
}
