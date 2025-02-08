package K31_alg;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(3);
        set1.add(4);
        set1.add(6);
        set1.add(2);
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(6);
        set2.add(2);
        set2.add(7);
        set2.add(4);
        System.out.println(compareSets(set1, set2));
    }

    public static <E> int compareSets(TreeSet<E> setOne, TreeSet<E> setTwo) {
        int count = 0;
        for (E item : setOne) {
            if (setTwo.contains(item)) {
                count++;
            }
        }
        return count;
    }
}
