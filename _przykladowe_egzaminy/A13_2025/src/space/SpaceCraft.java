package space;

import java.util.Arrays;
import java.util.Objects;

public class SpaceCraft {
    private String name;
    private String manufacturer;
    private Double[] ratings;

    public SpaceCraft(String name, String manufacturer, Double[] ratings) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.ratings = Arrays.copyOf(ratings, ratings.length);
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

    public Double[] getRatings() {
        return Arrays.copyOf(ratings, ratings.length);
    }

    public void setRatings(Double[] ratings) {
        this.ratings = Arrays.copyOf(ratings, ratings.length);
    }

    public void addRating(double rating) {
        Double[] newRatings = Arrays.copyOf(ratings, ratings.length + 1);
        newRatings[newRatings.length - 1] = rating;
        this.ratings = newRatings;
    }

    public void removeRating(int index) {
        Double[] newRatings = new Double[ratings.length - 1];
        int i = 0;
        for (int j = 0; j < ratings.length; j++) {
            if (i != index) {
                newRatings[i++] = ratings[j];
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
        SpaceCraft that = (SpaceCraft) o;
        return Objects.equals(name, that.name) && Objects.equals(manufacturer, that.manufacturer) && Objects.deepEquals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, Arrays.hashCode(ratings));
    }
}
