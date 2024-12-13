package zad5;

public class Main {
    public static void main(String[] args) {
        Results r1 = new Results("Jan", "Kowalski", 3);
        r1.addResult(0, 4);
        r1.addResult(1, 3);
        r1.addResult(2, 2);
        System.out.println(r1.getFirstName());
        System.out.println(r1.averageResult());
        r1.addResult(1, 5);
        System.out.println(r1);
    }
}
