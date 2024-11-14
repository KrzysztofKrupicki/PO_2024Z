package cw5.zad7;

import java.util.ArrayList;
import java.util.Objects;

public class Laptop extends Computer {
    public double weight;

    public Laptop(String manufacturer, String model, ArrayList<Double> partsPrices, double weight) {
        super(manufacturer, model, partsPrices);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(laptop.getWeight(), getWeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWeight());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", partsPrices=" + partsPrices +
                '}';
    }
}
