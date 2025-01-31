package sports;

import java.util.Comparator;

public class NationalityNameComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        int nationalityComparation = o2.getNationality().compareTo(o1.getNationality());
        if(nationalityComparation != 0){
            return nationalityComparation;
        }
        return o2.getName().compareTo(o1.getName());
    }
}
