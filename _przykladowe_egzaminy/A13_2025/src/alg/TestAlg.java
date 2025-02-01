package alg;

import java.util.TreeSet;

public class TestAlg {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(4);
        treeSet.add(10);
        treeSet.add(5);
        System.out.println(treeSet.size());
        System.out.println(Alg.isUnique(treeSet));
    }
}
