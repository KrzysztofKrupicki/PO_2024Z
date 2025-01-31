package university;

import java.util.ArrayList;
import java.util.Collection;

public class TestStudent {
    public static void main(String[] args) {
        Collection<Student> students = new ArrayList<>();
        students.add(new Student("Student 1", 4.5));
        students.add(new Student("Student 2", 4.2));
        students.add(new Student("Student 4", 3.5));
        students.add(new Student("Student 4", 3.5));
        students.add(new Student("Student 4", 3.5));
        System.out.println(countElements(students, new Student("Student 4", 3.5)));
    }
    public static <T> int countElements(Collection<T> items, T element){
        int counter = 0;
        for(T item : items){
            if(item.equals(element)){
                counter++;
            }
        }
        return counter;
    }
}
