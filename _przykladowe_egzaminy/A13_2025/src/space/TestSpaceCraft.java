package space;

public class TestSpaceCraft {
    public static void main(String[] args) {
        SpaceCraft sc1 = new SpaceCraft("Spacecraft 1", "Manufacturer 1", new Double[]{3.5, 5.1});
        SpaceCraft sc2 = new SpaceCraft("Spacecraft 2", "Manufacturer 1", new Double[]{6.1, 8.6});
        sc2.addRating(7.5);
        System.out.println(sc2);
        System.out.println(sc1.equals(sc2));
        System.out.println(sc2.hashCode());
    }
}
