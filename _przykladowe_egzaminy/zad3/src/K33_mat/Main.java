package K33_mat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(4);
        integers.add(3);
        integers.add(6);
        Collection<Integer> integers2 = new ArrayList<>();
        integers2.add(3);
        integers2.add(4);
        integers2.add(4);
        integers2.add(6);
        System.out.println(isMonotonicallyIncreasing(integers));
        System.out.println(isMonotonicallyIncreasing(integers2));
    }

    public static <T extends Comparable<T>> boolean isMonotonicallyIncreasing(Collection<T> collection) {
        if (collection.isEmpty() || collection == null) {
            throw new IllegalArgumentException("Metoda nie przyjmuje pustej lub niezainicjalizowanej kolekcji");
        }
        Iterator<T> iterator = collection.iterator();
        T prev = iterator.next();
        while (iterator.hasNext()) {
            T current = iterator.next();
            if (current.compareTo(prev) < 0) {
                return false;
            }
            prev = current;
        }
        return true;
    }
}
