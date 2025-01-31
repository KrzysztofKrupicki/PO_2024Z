package events;

import java.util.Comparator;

public class DateComparator implements Comparator<CulturalEvent> {
    @Override
    public int compare(CulturalEvent o1, CulturalEvent o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
