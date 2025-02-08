package L31_check;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkOrder(4, 4));
        System.out.println(checkOrder(4, 6));
        System.out.println(checkOrder(6, 4));
    }

    public static <T extends Comparable<T>> int checkOrder(T arg1, T arg2) {
        if (arg1.compareTo(arg2) > 0) {
            return 2;
        }
        if (arg1.compareTo(arg2) < 0) {
            return -2;
        }
        return 0;
    }
}
