package L33_pl.progGeneryczne;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Student 1", 23);
        Student student2 = new Student("Student 2", 23);
        Student student3 = new Student("Student 3", 23);
        System.out.println(countUniqueElements(student1, student2, student3));
    }

    public static <T> int countUniqueElements(T arg1, T arg2, T arg3) {
        if (arg1 == null || arg2 == null || arg3 == null) {
            throw new NullPointerException("Argument nie moze byc nullem");
        }
        HashSet<T> hashSet = new HashSet<>();
        hashSet.add(arg1);
        hashSet.add(arg2);
        hashSet.add(arg3);
        return hashSet.size();
    }
}
