package sports;

import java.util.Comparator;

public class yearOfAchievementComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        return Integer.compare(o1.getYearOfAchievement(), o2.getYearOfAchievement());
    }
}
