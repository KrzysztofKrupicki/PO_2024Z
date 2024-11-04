package zad5;

public class Main {
    public static void main(String[] args) {
        Coach c1 = new Coach();
        c1.firstName = "Paweł";
        System.out.println(c1.firstName);
    }

    private static class Coach {
        String firstName;
    }
}
