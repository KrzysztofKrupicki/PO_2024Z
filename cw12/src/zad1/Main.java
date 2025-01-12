package zad1;

public class Main {
    public static void main(String[] args) {
        Triple<String, Double, Integer> triple = new Triple<>("Cześć", 3.14, 9);
        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());
    }
}
