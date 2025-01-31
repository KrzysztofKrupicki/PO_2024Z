package sports;

import java.util.ArrayList;

public class TestAthlete {
    public static void main(String[] args) {
        ArrayList<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete("Athlete 1", "Sport 1", 2011));
        athletes.add(new Athlete("Athlete 2", "Sport 1", 2007));
        athletes.add(new Athlete("Athlete 3", "Sport 2", 2003));
        athletes.add(new Athlete("Athlete 4", "Sport 3", 2023));
        athletes.sort(new yearOfAchievementComparator());
        for(Athlete athlete : athletes){
            System.out.println(athlete);
        }
    }
}
