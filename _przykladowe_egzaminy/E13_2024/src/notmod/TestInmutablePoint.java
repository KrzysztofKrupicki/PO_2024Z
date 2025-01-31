package notmod;

public class TestInmutablePoint {

    public static void main(String[] args) {
        InmutablPoint p1 = new InmutablPoint(1, 2, 3);
        InmutablPoint p2 = new InmutablPoint(1, 2, 3);
        System.out.println("p1 == p2: " + (p1 == p2));
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);
    }
}