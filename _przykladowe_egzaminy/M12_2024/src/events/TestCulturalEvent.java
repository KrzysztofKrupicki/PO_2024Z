package events;

import java.util.ArrayList;

public class TestCulturalEvent {
    public static void main(String[] args) {
        ArrayList<CulturalEvent> culturalEventArrayList = new ArrayList<>();
        culturalEventArrayList.add(new CulturalEvent(0, "Nowy gadzet", "2024-10-12"));
        culturalEventArrayList.add(new CulturalEvent(0, "Automaniak", "2024-04-16"));
        culturalEventArrayList.add(new CulturalEvent(0, "Tech News", "2024-04-16"));
        culturalEventArrayList.add(new CulturalEvent(0, "Chwytaj dzień", "2025-08-27"));
        culturalEventArrayList.add(new CulturalEvent(0, "Polonez", "2024-02-07"));
        culturalEventArrayList.sort(new DateComparator().thenComparing(new NameComparator()));
        for(CulturalEvent event: culturalEventArrayList){
            System.out.println(event);
        }
    }
}
