package geography;

import java.util.ArrayList;
import java.util.List;

public class TestMountain {
    public static void main(String[] args) {
        ArrayList<Double> heights = new ArrayList<>();
        heights.add(1995.0);
        heights.add(1996.0);
        heights.add(1997.0);
        heights.add(1998.0);
        heights.add(1999.0);
        Mountain mountain = new Mountain("Mountain 1", heights);
        Mountain clonedMountain = mountain.clone();
        heights.remove(4);
        heights.add(2000.0);
        mountain.setHeights(heights);
        System.out.println(mountain.getHeights());
        System.out.println(clonedMountain.getHeights());
    }
}
