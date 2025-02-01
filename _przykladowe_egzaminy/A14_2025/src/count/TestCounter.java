package count;

import java.util.LinkedList;

public class TestCounter {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(1);
        linkedList.add(8);
        System.out.println(Counter.countGreatherThan(linkedList, 6));
    }
}
