package K32_utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Collection<Student> students = new ArrayList<>();
        students.add(new Student("Jan", "Course"));
        students.add(new Student("Anna", "Course"));
        students.add(new Student("Jan", "Course"));
        students.add(new Student("Kamil", "Course"));
        students.add(new Student("Kamil", "Course"));
        students.add(new Student("Anna", "Course"));
        filterUnique(students);
        System.out.println(students);
    }

    public static <T> void filterUnique(Collection<T> items) {
        if (items.isEmpty() || items == null) {
            throw new IllegalArgumentException("Argument nie moze byc pusty lub null");
        }
        Collection<T> filtered = new HashSet<>(items);
        items.clear();
        items.addAll(filtered);
    }
}
