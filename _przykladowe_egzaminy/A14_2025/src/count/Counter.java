package count;

import java.util.LinkedList;

public class Counter {
    public static <E extends Comparable<E>> int countGreatherThan(LinkedList<E> linkedList, E element){
        int counter = 0;
        for(E item : linkedList){
            if(item.compareTo(element) > 0){
                counter++;
            }
        }
        return counter;
    }
}
