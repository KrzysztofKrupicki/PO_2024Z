package K14_fruit;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = {
                new Fruit("Banana", 5),
                new Fruit("Apple", 3),
                new Fruit("Mango", 3),
                new Fruit("Pineapple", 7)
        };
        System.out.println(firstMinValue(fruits));
    }

    public static <T extends Comparable<T>> T firstMinValue(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Podano pustą lub niezainicjowaną tablicę");
        }
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }
}
