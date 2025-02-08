package K24_verification;

public class Main {
    public static void main(String[] args) {
        displayIfDistinct("java", "java", "hello");
        displayIfDistinct("java", "world", "hello");
    }

    public static <T> void displayIfDistinct(T arg1, T arg2, T arg3) {
        if (!arg1.equals(arg2) && !arg2.equals(arg3) && !arg3.equals(arg1)) {
            System.out.println("Wszystkie trzy są różne");
        }
    }
}
