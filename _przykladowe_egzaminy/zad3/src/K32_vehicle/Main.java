package K32_vehicle;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {6, 2, 6, 8, 1};
        Integer[] integers2 = {8, 6, 5, 5, 1};
        System.out.println(isDescending(integers));
        System.out.println(isDescending(integers2));
    }

    public static <T extends Comparable<T>> boolean isDescending(T[] array) {
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException("Metoda nie przyjmuje pustej lub niezainicjalizowanej tablicy");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) < 0) {
                return false;
            }
        }
        return true;
    }
}
