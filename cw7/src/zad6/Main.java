package zad6;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("","Corozja", 2026);
        Vehicle v2 = new Vehicle("","Corozja", 2026);
        System.out.println(v1);
        System.out.println(v1.equals(v2));
    }
}
