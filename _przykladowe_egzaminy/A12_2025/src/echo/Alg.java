package echo;

public class Alg {
    public static <T> void echoIfEquivalent(T arg1, T arg2, T arg3) {
        if (arg1.equals(arg2) && arg2.equals(arg3)) {
            System.out.println("Wszystkie trzy są równoważne");
        }
    }
}
