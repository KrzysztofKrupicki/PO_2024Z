package K34_alg;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(5);
        integers.add(4);
        integers.add(6);
        integers.add(5);
        System.out.println(isUnique(integers));
    }

    public static <E> boolean isUnique(TreeSet<E> elements) {
        return true;
    }
}
