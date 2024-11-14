package cw6.zad5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Jan", "Kowalski", new ArrayList<>(Arrays.asList(4, 5, 3, 2)));
        System.out.println(s1.averageGrades());
    }
}
