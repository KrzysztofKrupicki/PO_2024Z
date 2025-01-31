package music;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("Spectre", "Alan Walker", 152),
                new Song("Alone", "Walker #001", 152),
                new Song("Alone", "Alan Walker", 152),
                new Song("Friends", "Walker #001", 203),
                new Song("Heart Over Mind", "Alan Walker", 182)
        };
        System.out.println("Przed sortowaniem:");
        for(Song song: songs){
            System.out.println(song);
        }
        System.out.println("Po sortowaniu po długości od najkrótszego do najdłuższego:");
        Arrays.sort(songs, new DurationComparator());
        for(Song song: songs){
            System.out.println(song);
        }
        System.out.println("Po sortowaniu po artyście i tytule w odwrotnej kolejności:");
        Arrays.sort(songs, new ArtistTitleComparator());
        for(Song song: songs){
            System.out.println(song);
        }
    }
}
