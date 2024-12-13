package zad1;

public class Vector extends ComputerGraphic {
    public Vector(int width, int height, String filename) {
        super(width, height, filename);
    }

    @Override
    public void loadFile() {
        System.out.println("Vector " + filename + " loaded");
    }

    @Override
    public void saveFile() {
        System.out.println("Vector " + filename + " saved");
    }
}
