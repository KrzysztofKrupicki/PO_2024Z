package zad5;

public class Main {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[]{5, 4, 2};

        for (Integer value : myArray) {
            System.out.println(value);
        }
        swap(myArray, 0, 3);
        System.out.println();
        swap(myArray, 0, 2);
        for (Integer integer : myArray) {
            System.out.println(integer);
        }
    }

    public static <T> void swap(T[] array, int i, int j) {
        try {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        } catch (IndexOutOfBoundsException e){
            System.out.println("Niepoprawny indeks");
        }
    }
}
