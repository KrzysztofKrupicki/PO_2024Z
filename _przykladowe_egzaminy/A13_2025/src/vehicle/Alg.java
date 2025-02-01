package vehicle;

public class Alg {
    public static <T extends Comparable<T>> boolean isDescending(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta ani nullem");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) < 0) {
                return false;
            }
        }
        return true;
    }
}
