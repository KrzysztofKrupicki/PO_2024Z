package zad3;

public class Main {
    public static void main(String[] args) {
        PointC p1 = new PointC(5,3);
        PointR p2 = new PointR(3,2);
        PointR p1nowy = p1.konwertujNaRekord();
        PointC p2nowy = p2.konwertujNaKlase();
        System.out.println(p1);
        System.out.println(p1nowy);
        System.out.println(p1nowy.x() + " " + p1nowy.y());
        System.out.println(p2);
        System.out.println(p2nowy);
        System.out.println(p2nowy.x + " " + p2nowy.y);
    }
}
