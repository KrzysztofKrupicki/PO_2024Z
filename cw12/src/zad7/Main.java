package zad7;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> integerCollection = List.of(5, 3, 7);
        Collection<Float> floatCollection = List.of(3.2f, 1.3f, 2.4f);
        System.out.println(sumElements(integerCollection));
        System.out.println(sumElements(floatCollection));
    }

    public static <T extends Number> double sumElements(Collection<T> collection) {
        double sum = 0.0;
        for (T item : collection) {
            sum += item.doubleValue();
        }
        return sum;
    }
}
