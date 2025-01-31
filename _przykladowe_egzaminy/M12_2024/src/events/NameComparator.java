package events;

import java.util.Comparator;

public class NameComparator implements Comparator<CulturalEvent> {
    @Override
    public int compare(CulturalEvent o1, CulturalEvent o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
