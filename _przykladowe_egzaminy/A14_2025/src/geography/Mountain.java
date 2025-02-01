package geography;

import java.util.ArrayList;

public class Mountain implements Cloneable{
    private String name;
    private ArrayList<Double> heights;

    public Mountain(String name, ArrayList<Double> heights) {
        this.name = name;
        this.heights = new ArrayList<>(heights);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getHeights() {
        return new ArrayList<>(heights);
    }

    public void setHeights(ArrayList<Double> heights) {
        this.heights = new ArrayList<>(heights);
    }

    @Override
    public Mountain clone() {
        try {
            Mountain clone = (Mountain) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.heights = new ArrayList<>(heights);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
