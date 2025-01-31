package algorithm;

import java.util.ArrayList;
import java.util.Collection;

public class TestAlg {
    public static void main(String[] args) {
        Collection<String> stringCollection = new ArrayList<>();
        Collection<String> collection = null;
        stringCollection.add("sample 1");
        stringCollection.add("sample 2");
        stringCollection.add("sample 3");
        System.out.println(stringCollection);
        Alg.clearIfContains(stringCollection, "sample 2");
        Alg.clearIfContains(collection, "sample");
    }
}
