package K22_book;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 4, 6, 1, 4, 3, 6, 1, 6, 8, 5, 4, 1, 5, 6};
        System.out.println(mostFrequentValue(integers));
    }

    public static <T extends Comparable<T>> T mostFrequentValue(T[] array) {
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException("Metoda nie przyjmuje pustej lub niezainicjalizowanej tablicy");
        }
        T mostFrequent = array[0];
        int maxCount = 1;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }
            if (count >= maxCount) {
                maxCount = count;
                mostFrequent = array[i];
            }
        }
        return mostFrequent;
    }
}
