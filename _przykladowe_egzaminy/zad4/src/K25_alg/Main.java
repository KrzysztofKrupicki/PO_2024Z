package K25_alg;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(7);
        list.add(8);
        System.out.println(compareFirstAndLast(list));
        list.add(5);
        System.out.println(compareFirstAndLast(list));
    }

    public static <E> boolean compareFirstAndLast(LinkedList<E> list) {
        return list.getFirst().equals(list.getLast());
    }
}
