package cw4.zad5;

import java.util.Arrays;
import java.util.Objects;

public class Results {
    private String firstName;
    private String lastName;
    private int[] results;

    public Results(String firstName, String lastName, int size) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = new int[size];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addResult(int index, int result) {
        if (index >= 0 && index < results.length) results[index] = result;
        else System.out.println("Indeks poza zakresem");
    }

    public double averageResult() {
        if (results.length == 0) return 0;
        double sum = 0;
        for (int result : results) sum += result;
        return sum / results.length;
    }

    @Override
    public String toString() {
        return "Results for " + firstName + " " + lastName + ": Average Score = " + averageResult() + ", Results: " + Arrays.toString(results) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Results results1)) return false;
        return Objects.equals(getFirstName(), results1.getFirstName()) && Objects.equals(getLastName(), results1.getLastName()) && Arrays.equals(results, results1.results);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getLastName());
        result = 31 * result + Arrays.hashCode(results);
        return result;
    }
}
