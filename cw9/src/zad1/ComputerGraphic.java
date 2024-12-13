package zad1;

public abstract class ComputerGraphic {
    int width;
    int height;
    String filename;

    public ComputerGraphic(int width, int height, String filename) {
        this.width = width;
        this.height = height;
        this.filename = filename;
    }

    public abstract void loadFile();

    public abstract void saveFile();
}
