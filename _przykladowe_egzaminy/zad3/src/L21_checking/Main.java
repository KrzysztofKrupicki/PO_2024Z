package L21_checking;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {2, 3, 6, 1};
        Integer[] integers2 = {2, 3, 6, 1};
        Integer[] integers3 = {2, 3, 3, 1};
        System.out.println(areArraysEqual(integers, integers2));
        System.out.println(areArraysEqual(integers, integers3));
    }

    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
}
