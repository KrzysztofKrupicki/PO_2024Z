package utilities;

public class Alg {
    public static <T extends Comparable<T>> T findMin(T elem1, T elem2, T elem3) {
        T min = elem1;
        if (elem2.compareTo(min) < 0)
            min = elem2;
        if (elem3.compareTo(min) < 0)
            min = elem3;
        return min;
    }
}
