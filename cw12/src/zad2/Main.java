package zad2;

public class Main {
    public static void main(String[] args) {
        Counter<String> stringCounter = new Counter<>();
        stringCounter.add("Witaj");
        stringCounter.add("Cześć");
        Counter<Double> doubleCounter = new Counter<>();
        doubleCounter.add(3.14);
        System.out.println(stringCounter.getCount());
        System.out.println(doubleCounter.getCount());
    }
}
