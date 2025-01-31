package music;

import java.util.ArrayList;
import java.util.Objects;

public class MusicStore {
    private String name;
    private String city;
    private ArrayList<String> albums;

    public MusicStore(String name, String city, ArrayList<String> albums) {
        this.name = name;
        this.city = city;
        this.albums = new ArrayList<>(albums);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getAlbums() {
        return albums = new ArrayList<>(albums);
    }

    public void setAlbums(ArrayList<String> albums) {
        this.albums = new ArrayList<>(albums);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MusicStore that = (MusicStore) o;
        return Objects.equals(name, that.name) && Objects.equals(city, that.city) && Objects.equals(albums, that.albums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, albums);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "Name: " + name + ", City: " + city + ", Albums: "+ albums + ".";
    }

    public void addAlbum(String album){
        albums.add(album);
    }
    public void removeAlbum(String album){
        albums.remove(album);
    }
}
