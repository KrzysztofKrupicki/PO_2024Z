package zad5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        dzielenie();
    }

    private static void dzielenie() {
        try {
            int n1, n2;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj pierwsza liczbe: ");
            try {
                n1 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono coś innego niż liczbę. Wprowadź liczbę ponownie");
                dzielenie();
                return;
            }

            System.out.println("Podaj druga liczbe: ");
            try {
                n2 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono coś innego niż liczbę. Wprowadź liczbę ponownie.");
                dzielenie();
                return;
            }

            if(n2 == 0){
                throw new ArithmeticException("Dzielenie przez 0 nie jest dozwolone");
            }
            System.out.println("Wynik " + n1 + "/" + n2 + " = " + n1*1.0/n2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            dzielenie();
        }
    }
}
