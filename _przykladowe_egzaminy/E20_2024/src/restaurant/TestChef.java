package restaurant;

import java.util.ArrayList;

public class TestChef {
    public static void main(String[] args) {
        ArrayList<Chef> chefs = new ArrayList<>();
        chefs.add(new Chef(0, "Robert Makłowicz", 4.7));
        chefs.add(new Chef(1, "Adam Małysz", 2.4));
        chefs.add(new Chef(2, "Magda Gessler", 4.5));
        chefs.add(new Chef(3, "Mateusz Gessler", 4.5));
        chefs.add(new Chef(4, "Adam Bodnar", 2.4));
        chefs.sort(new skillLevelNameComparator());
        for(Chef chef : chefs){
            System.out.println(chef);
        }
    }
}
