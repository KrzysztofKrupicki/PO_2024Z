package K35_comparisons;

public class Main {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println(areAllDifferent("string", "hello", "hello"));
        System.out.println("2");
        System.out.println(areAllDifferent("string", "hello", "world"));
    }

    public static <T> boolean areAllDifferent(T arg1, T arg2, T arg3) {
        return !arg1.equals(arg2) && !arg2.equals(arg3) && !arg3.equals(arg1);
    }
}
