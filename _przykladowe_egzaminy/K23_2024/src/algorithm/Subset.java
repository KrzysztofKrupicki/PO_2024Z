package algorithm;

import java.util.HashSet;

public class Subset {
    public <E> boolean isSubset(HashSet<E> set1, HashSet<E> set2){
        for(E elem: set1){
            if(!set2.contains(elem)){
                return false;
            }
        }
        return true;
    }
}
