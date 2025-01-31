package sports;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {
        Athlete[] athletes = {
                new Athlete("Iga Świątek", "Poland", new double[]{3.2, 5.6, 2.4}),
                new Athlete("LeBron James", "USA", new double[]{6, 3, 11}),
                new Athlete("Robert Lewandowski", "Poland", new double[]{7, 9, 4, 11, 5}),
                new Athlete("Anonymous Athlete", "England", new double[]{3.2, 5.6, 2.4})
        };
        System.out.println("Przed sortowaniem:");
        for(Athlete athlete: athletes){
            System.out.println(athlete);
        }
        System.out.println("Po sortowaniu:");
        Arrays.sort(athletes, new RecordComparator().thenComparing(new NationalityNameComparator()));
        for(Athlete athlete: athletes){
            System.out.println(athlete);
        }
    }
}
