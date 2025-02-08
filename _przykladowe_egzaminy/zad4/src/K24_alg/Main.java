package K24_alg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Collection<Employee> collection1 = new ArrayList<>();
        collection1.add(new Employee("Jan", "Department 1"));
        collection1.add(new Employee("Jan", "Department 2"));
        collection1.add(new Employee("Anna", "Department 1"));
        Collection<Employee> collection2 = new ArrayList<>();
        collection2.add(new Employee("Anna", "Department 2"));
        collection2.add(new Employee("Kamil", "Department 3"));
        collection2.add(new Employee("Jan", "Department 3"));
        Collection<Employee> merged = mergeCollections(collection1, collection2);
        for (Employee employee : merged) {
            System.out.println(employee);
        }
    }

    public static <T> Collection<T> mergeCollections(Collection<T> collection1, Collection<T> collection2) {
        if (collection1.isEmpty() || collection2.isEmpty() || collection1 == null || collection2 == null) {
            throw new IllegalArgumentException("Argumenty nie mogą byćpuste lub null");
        }
        HashSet<T> set1 = new HashSet<>(collection1);
        Collection<T> newCollection = new ArrayList<>(set1);
        for (T item : collection2) {
            if (!newCollection.contains(item)) {
                newCollection.add(item);
            }
        }
        return new ArrayList<>(set1);
    }
}
