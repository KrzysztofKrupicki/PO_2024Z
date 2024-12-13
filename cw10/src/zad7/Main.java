package zad7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CreditCard c1 = new CreditCard("591275781", "Jan Kowalski", LocalDate.of(2024, 12, 31));
        CreditCard c2 = c1.clone();
        c1.setExpiryDate(LocalDate.of(2028, 6, 15));
        System.out.println(c1);
        System.out.println(c2);
    }
}
