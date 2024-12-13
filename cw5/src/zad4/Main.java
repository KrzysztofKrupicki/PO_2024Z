package zad4;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(2, 3));
        ExtendedCalculator ec1 = new ExtendedCalculator();
        System.out.println(ec1.add(3, 4, 5));
    }
}
