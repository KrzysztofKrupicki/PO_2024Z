package restaurant;

import java.util.Comparator;

public class skillLevelNameComparator implements Comparator<Chef> {
    @Override
    public int compare(Chef o1, Chef o2) {
        int skillLevelComparation = Double.compare(o2.getSkillLevel(), o1.getSkillLevel());
        if (skillLevelComparation != 0) {
            return skillLevelComparation;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
