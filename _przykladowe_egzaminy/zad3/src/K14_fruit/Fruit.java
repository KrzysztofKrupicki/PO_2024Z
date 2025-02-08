package K14_fruit;

public class Fruit implements Comparable<Fruit>{
    private String name;
    private double sweetness;

    public Fruit(String name, double sweetness) {
        this.name = name;
        this.sweetness = sweetness;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", sweetness=" + sweetness +
                '}';
    }

    @Override
    public int compareTo(Fruit o) {
        return Double.compare(sweetness, o.sweetness);
    }
}
