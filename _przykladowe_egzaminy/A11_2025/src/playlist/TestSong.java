package playlist;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("Darkside", "Alan Walker", 150),
                new Song("Friends", "Marshmello", 164),
                new Song("Hey Brother", "Avicii", 180),
                new Song("dddd", "favst", 150),
                new Song("Alone", "Alan Walker", 150)
        };
        System.out.println("Przed:");
        for (Song song : songs) {
            System.out.println(song);
        }
        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println("Po:");
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
