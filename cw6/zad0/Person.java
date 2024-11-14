package cw6.zad0;

import java.util.Objects;

public record Person(String imie, int wiek) {
    public Person {
        if (wiek < 0) wiek = 0;
        if (imie == null || imie.equals("")) imie = "default";
    }

    public Person(String imie) {
        this(imie, 0);
    }

    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + ", mam " + wiek + " lat.");
    }
}
