package utilities;

import java.util.ArrayList;

public class TestAlg {
    public static void main(String[] args) {
        ArrayList<Integer> target = new ArrayList<>();
        target.add(4);
        target.add(7);
        ArrayList<Integer> source = new ArrayList<>();
        source.add(3);
        source.add(1);
        source.add(6);
        Alg.appendFromEnd(target, source);
        for (Integer integer : target) {
            System.out.println(integer);
        }
    }
}
