package zad6;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{};
        Double[] doubles = new Double[]{3.14, 6.78, 1.26};
        String[] strings = new String[]{"b", "a", "c"};

        System.out.println(maxValue(integers));
        System.out.println(maxValue(doubles));
        System.out.println(maxValue(strings));
    }

    public static <T extends Comparable<T>> T maxValue(T[] array) {
        try {
            if (array.length == 0) {
                throw new IndexOutOfBoundsException("Podano pustą tablicę");
            }
            T max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (max.compareTo(array[i]) < 0) {
                    max = array[i];
                }
            }
            return max;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
