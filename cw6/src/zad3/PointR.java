package zad3;

public record PointR(int x, int y) {
    public PointC konwertujNaKlase() {
        return new PointC(x, y);
    }
}
