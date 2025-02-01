package space;

public class TestInmutableSpacecraftPosition {
    public static void main(String[] args) {
        InmutableSpacecraftPosition spacecraftPosition = new InmutableSpacecraftPosition(4.7, 5.2, 1.3);
        System.out.println(spacecraftPosition);
        InmutableSpacecraftPosition spacecraftPositionMoved = spacecraftPosition.move(4, -5, 6);
        System.out.println(spacecraftPositionMoved);
    }
}
