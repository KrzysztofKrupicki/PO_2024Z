package zad3;

public class Main {
    public static void main(String[] args) {
        String s1 = "Witaj";
        int i1 = 5;
        String s2 = "Witaj";

        System.out.println(isEqual(s1, i1));
        System.out.println(isEqual(s1, s2));
    }
    public static <T> boolean isEqual(T object1, T object2){
        return object1.equals(object2);
    }
}
