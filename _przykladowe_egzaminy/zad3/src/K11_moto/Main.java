package K11_moto;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{4, 7, 2, 7, 4};
        System.out.println(lastMaxValue(integers));
    }

    public static <T extends Comparable<T>> T lastMaxValue(T[] array) {
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException("Podano pustą lub niezainicjowaną tablicę");
        }
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max.compareTo(array[i]) <= 0) {
                max = array[i];
            }
        }
        return max;
    }
}
