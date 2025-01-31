package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Szpital1", 1.2);
        Hospital h2 = new Hospital(null, -10);
        Hospital h3 = new Hospital("Szpital1", 1.2);
        Clinic c1 = new Clinic("Klinika1", 2.3, 6);
        Clinic c2 = new Clinic(null, 60, 3.6);
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
        System.out.println(h1.equals(c1));
        System.out.println(h1.equals(c2));
        System.out.println(c1.equals(c2));
        System.out.println(h1);
        System.out.println(h2);
    }
}
