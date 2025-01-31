package music;

import java.util.Comparator;

public class DurationComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return Integer.compare(o1.getDuration(), o2.getDuration());
    }
}
