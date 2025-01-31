package playlist;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        int artistComparation = o1.getArtist().compareTo(o2.getArtist());
        if (artistComparation != 0) {
            return artistComparation;
        }
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
