package cw6.zad5;

import java.util.ArrayList;

public record Student(String firstName, String lastName, ArrayList<Integer> grades) {
    public double averageGrades() {
        double sum = 0;
        for (Integer grade : grades) sum += grade;
        return sum / grades.size();
    }
}
