package K13_verification;

public class Main {
    public static void main(String[] args) {
        System.out.println(isEitherNull(null, 7));
        System.out.println(isEitherNull("test", 7));
        System.out.println(isEitherNull(null, null));
    }

    public static <T> boolean isEitherNull(T arg1, T arg2) {
        return arg1 == null || arg2 == null;
    }
}
