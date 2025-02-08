package K21_consistency;

public class Main {
    public static void main(String[] args) {
        System.out.println(areBothNonNull(null, "java"));
        System.out.println(areBothNonNull("idea", "java"));
        System.out.println(areBothNonNull(null, null));
    }

    public static <T> boolean areBothNonNull(T arg1, T arg2) {
        return arg1 != null && arg2 != null;
    }
}
