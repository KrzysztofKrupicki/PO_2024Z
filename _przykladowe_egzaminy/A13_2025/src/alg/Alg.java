package alg;

import java.util.TreeSet;

public class Alg {
    public static <E> boolean isUnique(TreeSet<E> elements){
        if(elements == null){
            throw new IllegalArgumentException("Argument nie moze byc nullem");
        }
        return true;
    }
}
