package algorithm;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(2);
        set1.add(6);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(6);
        set2.add(2);
        System.out.println(compareSets(set1, set2));
    }

    public static <E> boolean compareSets(HashSet<E> set1, HashSet<E> set2) {
        if (set1 == null || set2 == null) {
            throw new IllegalArgumentException("Argument null");
        }
        return set1.equals(set2);
    }
}
