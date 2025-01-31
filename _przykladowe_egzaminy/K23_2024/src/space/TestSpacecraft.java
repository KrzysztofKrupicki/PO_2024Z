package space;

public class TestSpacecraft {
    public static void main(String[] args) {
        Spacecraft sc1 = new Spacecraft("Spacecraft 1", "Manufacturer 1", new double[]{3.5, 4.6, 5.2});
        Spacecraft sc2 = new Spacecraft("Spacecraft 2", "Manufacturer 2", new double[]{5.1, 2.4, 1.7});
        sc1.addRating(3.9);
        System.out.println(sc1);
        sc1.removeRating(4.6);
        System.out.println(sc1);
        sc2.setRatings(sc1.getRatings());
        sc2.setRatings(new double[]{3.1, 3.1, 3.2});
        System.out.println(sc1);
        System.out.println(sc2);
    }
}
