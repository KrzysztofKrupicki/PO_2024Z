package zad1;

public class Bitmap extends ComputerGraphic {
    public Bitmap(int width, int height, String filename) {
        super(width, height, filename);
    }

    @Override
    public void loadFile() {
        System.out.println("Bitmap " + filename + " loaded");
    }

    @Override
    public void saveFile() {
        System.out.println("Bitmap " + filename + " saved");
    }
}
