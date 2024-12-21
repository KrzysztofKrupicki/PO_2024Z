package zad0_2;

public class SklepMonopolowy {
    public static void main(String[] args) {
        try {
            sprzedajCos();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void sprzedajCos() throws IllegalArgumentException {
        checkAge(16);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Niepełnoletni klient");
        }
    }
}
