package K22_alg;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "a");
        treeMap.put(2, "b");
        treeMap.put(3, "c");
        System.out.println(treeMap);
        TreeMap<String, Integer> reversedMap = reverseMap(treeMap);
        System.out.println(reversedMap);
    }

    public static <K, V> TreeMap<V, K> reverseMap(TreeMap<K, V> map) {
        if (map.isEmpty() || map == null) {
            throw new IllegalArgumentException("Argument nie może być pusty lub null");
        }
        TreeMap<V, K> newMap = new TreeMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;
    }
}
