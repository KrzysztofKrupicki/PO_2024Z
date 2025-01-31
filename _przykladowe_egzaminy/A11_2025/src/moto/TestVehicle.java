package moto;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("Toyota", 120),
                new Vehicle("BMW", 180),
                new Vehicle("Audi", 200),
                new Vehicle("Mercedes", 220),
                new Vehicle("Ford", 150)
        };
        System.out.println(maxValue(vehicles));
    }

    public static <T extends Comparable<T>> T maxValue(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Pusta tablica");
        }
        T max = array[0];
        for (T e : array) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }
}
