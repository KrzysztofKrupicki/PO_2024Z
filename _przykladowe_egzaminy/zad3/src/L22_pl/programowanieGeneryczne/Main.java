package L22_pl.programowanieGeneryczne;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkSequence(5, 4, 7));
        System.out.println(checkSequence(5, 6, 7));
        System.out.println(checkSequence(5, 4, 3));
        System.out.println(checkSequence(5, 6, 3));
    }

    public static <T extends Comparable<T>> boolean checkSequence(T arg1, T arg2, T arg3) {
        return arg1.compareTo(arg2) > 0 && arg2.compareTo(arg3) > 0 || arg1.compareTo(arg2) < 0 && arg2.compareTo(arg3) < 0;
    }
}
