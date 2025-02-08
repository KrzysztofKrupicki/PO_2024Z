package K15_checking;

public class Main {
    public static void main(String[] args) {
        echoIfEquivalent("Hello", "Hello", "Hello");
    }

    public static <T> void echoIfEquivalent(T arg1, T arg2, T arg3) {
        if (arg1.equals(arg2) && arg2.equals(arg3)) {
            System.out.println("Wszystkie trzy równoważne");
        }
    }
}
