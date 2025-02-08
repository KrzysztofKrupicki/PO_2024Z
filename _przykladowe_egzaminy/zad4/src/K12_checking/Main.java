package K12_checking;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(5);
        set1.add(6);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(8);
        set2.add(9);
        System.out.println(checkDisjoint(set1, set2));
    }

    public static <E> boolean checkDisjoint(HashSet<E> set1, HashSet<E> set2) {
        if (set1.isEmpty() || set2.isEmpty() || set1 == null || set2 == null) {
            throw new IllegalArgumentException("Argumenty nie mogą być puste lub null");
        }
        for (E item : set1) {
            if (set2.contains(item)) {
                return false;
            }
        }
        return true;
    }
}
