package space;

import java.util.Arrays;
import java.util.Objects;

public class Spacecraft {
    private String name;
    private String manufacturer;
    private double[] ratings;

    public Spacecraft(String name, String manufacturer, double[] ratings) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.ratings = ratings.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double[] getRatings() {
        return ratings.clone();
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings.clone();
    }

    public void addRating(double rating) {
        double[] newRatings = Arrays.copyOf(ratings, ratings.length + 1);
        newRatings[ratings.length] = rating;
        setRatings(newRatings);
    }

    public void removeRating(double rating) {
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] == rating) {
                double[] newRatings = new double[ratings.length - 1];
                System.arraycopy(ratings, 0, newRatings, 0, i);
                System.arraycopy(ratings, i + 1, newRatings, i, ratings.length - i - 1);
                setRatings(newRatings);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name + ", " + manufacturer + ", " + Arrays.toString(ratings) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Spacecraft that = (Spacecraft) o;
        return Objects.equals(name, that.name) && Objects.equals(manufacturer, that.manufacturer) && Objects.deepEquals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, Arrays.hashCode(ratings));
    }
}
