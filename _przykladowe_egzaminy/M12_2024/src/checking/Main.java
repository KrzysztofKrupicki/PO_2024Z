package checking;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"A", "B", "C"};
        System.out.println(checkIfExists(strings, "B"));
        System.out.println(checkIfExists(strings, "D"));
        System.out.println(checkIfExists(null, "D"));
        System.out.println(checkIfExists(strings, null));
    }

    public static <T> boolean checkIfExists(T[] array, T element) {
        if (array == null || element == null) {
            throw new IllegalArgumentException("Wykryto null");
        }
        for (T elem : array) {
            if (elem == element) {
                return true;
            }
        }
        return false;
    }
}
