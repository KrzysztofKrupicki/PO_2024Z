package utilities;

import java.util.ArrayList;

public class Alg {
    public static <E> void appendFromEnd(ArrayList<? super E> target, ArrayList<E> source) {
        for (int i = source.size() - 1; i >= 0; i--) {
            target.add(source.get(i));
        }
    }
}
