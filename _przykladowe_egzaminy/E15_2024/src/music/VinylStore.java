package music;

import java.util.ArrayList;
import java.util.Objects;

public class VinylStore extends MusicStore {
    private int numberOfVinyls;

    public VinylStore(String name, String city, ArrayList<String> albums, int numberOfVinyls) {
        super(name, city, albums);
        this.numberOfVinyls = numberOfVinyls;
    }

    public int getNumberOfVinyls() {
        return numberOfVinyls;
    }

    public void setNumberOfVinyls(int numberOfVinyls) {
        this.numberOfVinyls = numberOfVinyls;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VinylStore that = (VinylStore) o;
        return numberOfVinyls == that.numberOfVinyls;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfVinyls);
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of vinyls: " + numberOfVinyls + ".";
    }
}
