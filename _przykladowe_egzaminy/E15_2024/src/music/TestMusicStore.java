package music;

import java.util.ArrayList;

public class TestMusicStore {
    public static void main(String[] args) {
        MusicStore musicStore = new MusicStore("Music store 1", "City 1", new ArrayList<>());
        MusicStore vinylStore = new VinylStore("Vinyl store 1", "City 2", new ArrayList<>(), 6);
        musicStore.addAlbum("Album 1");
        musicStore.addAlbum("Album 2");
        musicStore.addAlbum("Album 3");
        musicStore.removeAlbum("Album 2");
        System.out.println(musicStore);
        vinylStore.addAlbum("Album 4");
        vinylStore.addAlbum("Album 3");
        vinylStore.removeAlbum("Album 3");
        System.out.println(vinylStore);
    }
}
