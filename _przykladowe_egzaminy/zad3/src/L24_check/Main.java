package L24_check;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkTypeCompatibility("hello", "world"));
    }

    public static <T> boolean checkTypeCompatibility(T arg1, T arg2) {
        return arg1.getClass() == arg2.getClass();
    }
}
