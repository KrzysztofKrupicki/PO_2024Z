package music;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        int artistComparation = o2.getArtist().compareTo(o1.getArtist());
        if(artistComparation != 0) {
            return artistComparation;
        }
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
