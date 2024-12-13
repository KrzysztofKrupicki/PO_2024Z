package zad1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ComputerGraphic> computerGraphics = new ArrayList<>();
        computerGraphics.add(new Bitmap(400, 400, "image1.bmp"));
        computerGraphics.add(new Vector(400, 800, "image2.svg"));
        computerGraphics.add(new Vector(1920, 1080, "image3.svg"));
        computerGraphics.add(new Bitmap(400, 400, "image4.bmp"));
        computerGraphics.add(new Bitmap(1000, 1000, "image5.bmp"));

        for (int i = 0; i < computerGraphics.size(); i++) {
            computerGraphics.get(i).loadFile();
            computerGraphics.get(i).saveFile();
        }
    }
}
