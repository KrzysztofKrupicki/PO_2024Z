package L32_checking;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Product 1", 12.39),
                new Product("Product 2", 11.99),
                null,
                new Product("Product 3", 16.49),
        };
        System.out.println(isArraySorted(products));
    }

    public static <T extends Comparable<T>> boolean isArraySorted(T[] array) {
        if (array == null) {
            throw new NullPointerException("Tablica nie jest zainicjalizowana");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == null || array[i + 1] == null) {
                throw new NullPointerException("Tablica zawiera element null");
            }
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }
}
