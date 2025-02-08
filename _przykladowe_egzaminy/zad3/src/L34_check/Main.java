package L34_check;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxOfTwo(5, 7));
    }

    public static <T extends Comparable<T>> T maxOfTwo(T arg1, T arg2) {
        if (arg1 == null || arg2 == null) {
            throw new NullPointerException("Argumenty nie moga byc nullem");
        }
        if (arg1.compareTo(arg2) >= 0) {
            return arg1;
        }
        return arg2;
    }
}
