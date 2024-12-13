package zad1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Fast 5", "Vin Diesel", "akcji"));
        movies.add(new Movie("Akademia pana Kleksa", "Historyk", "wojenny"));
        movies.add(new Movie("Leonardo Da Vincii", "Anonim", "biografia"));
        movies.add(new Movie("Coco", "Animator", "animacja"));

        System.out.println(movies);
        Collections.sort(movies);
        System.out.println(movies);
    }
}
