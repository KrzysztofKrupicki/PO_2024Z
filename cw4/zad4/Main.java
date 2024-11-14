package cw4.zad4;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(null, "Supra", 2077);
        Vehicle v2 = new Vehicle(null, "Supra", 2023);
        Vehicle v3 = new Vehicle("Toyota", "Corozja", 2019);
        System.out.println(v1);
        System.out.println(v3);
        System.out.println(v1.equals(v2));
    }
}
