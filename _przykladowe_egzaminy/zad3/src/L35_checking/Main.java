package L35_checking;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {4, 5, 1, 4, 5, 5, 1, 3};
        System.out.println(countOccurrences(integers, 4));
        System.out.println(countOccurrences(integers, 5));
    }

    public static <T> int countOccurrences(T[] array, T element) {
        if (array.length == 0 || array == null || element == null) {
            throw new IllegalArgumentException("Tablica ani element nie moze byc pusta i niezainicjalizowana");
        }
        int count = 0;
        for (T elem : array) {
            if (elem == null) {
                throw new IllegalArgumentException("Element tablicy jest nullem");
            }
            if (elem.equals(element)) {
                count++;
            }
        }
        return count;
    }
}
