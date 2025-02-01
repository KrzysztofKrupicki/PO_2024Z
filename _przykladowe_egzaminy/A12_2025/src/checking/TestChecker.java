package checking;

import java.util.HashSet;

public class TestChecker {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(6);
        set1.add(1);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(7);
        System.out.println(Checker.checkDisjoint(set1, set2));
        set2.add(1);
        System.out.println(Checker.checkDisjoint(set1, set2));
    }
}
