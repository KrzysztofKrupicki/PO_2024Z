package K25_fruit;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {3, 5, 6, 5, 7};
        Integer[] integers2 = {3, 5, 5, 6, 7};
        System.out.println(isSorted(integers));
        System.out.println(isSorted(integers2));
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] array) {
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException("Metoda nie przyjmuje pustej lub niezainicjalizowanej tablicy");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }
}
