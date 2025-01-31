package algorithm;

public class Alg {
    public static <T> boolean compareThree(T arg1, T arg2, T arg3){
        return arg1.equals(arg2) && arg2.equals(arg3);
    }
}
