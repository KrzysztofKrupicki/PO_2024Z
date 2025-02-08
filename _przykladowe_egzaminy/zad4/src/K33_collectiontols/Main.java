package K33_collectiontols;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Product> products1 = new HashSet<>();
        products1.add(new Product("Banana", "fruits"));
        products1.add(new Product("Apple", "fruits"));
        products1.add(new Product("Mango", "fruits"));
        HashSet<Product> products2 = new HashSet<>();
        products2.add(new Product("Pineapple", "fruits"));
        products2.add(new Product("Apple", "fruits"));
        products2.add(new Product("Banana", "fruits"));
        HashSet<Product> combinedProducts = combineSets(products1, products2);
        System.out.println(combinedProducts);
    }

    public static <T> HashSet<T> combineSets(HashSet<T> set1, HashSet<T> set2) {
        HashSet<T> combinedSet = new HashSet<>(set1);
        combinedSet.addAll(set2);
        return combinedSet;
    }
}
