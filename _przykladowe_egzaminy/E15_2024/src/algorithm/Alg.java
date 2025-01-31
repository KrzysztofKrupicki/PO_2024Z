package algorithm;

import java.util.Collection;

public class Alg {
    public static <E> void clearIfContains(Collection<E> collection, E element){
        if(collection == null){
            return;
        }
        if(collection.contains(element)){
            collection.clear();
        }
    }
}
