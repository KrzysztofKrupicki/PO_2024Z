package K23_relationcheck;

public class Main {
    public static void main(String[] args) {
        System.out.println(isExactlyOneNull(null, null));
        System.out.println(isExactlyOneNull("java", null));
        System.out.println(isExactlyOneNull("hello", "world"));
    }

    public static <T> boolean isExactlyOneNull(T arg1, T arg2) {
        return arg1 == null && arg2 != null || arg1 != null && arg2 == null;
    }
}
