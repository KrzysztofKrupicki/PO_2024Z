package checking;

import java.util.HashSet;

public class Checker {
    public static <E> boolean checkDisjoint(HashSet<E> set1, HashSet<E> set2) {
        if (set1 == null || set2 == null) {
            throw new IllegalArgumentException("Jeden ze zbiorów jest nullem");
        }
        for (E elem : set1) {
            if (set2.contains(elem)) {
                return false;
            }
        }
        return true;
    }
}
