package zad8;

import java.util.Arrays;

public class Employee implements Cloneable{
    String name;
    double[] salaries;

    public Employee(String name, double[] salaries) {
        this.name = name;
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return getName() + " " + Arrays.toString(getSalaries());
    }

    @Override
    public Employee clone() {
        try {
            Employee clone = (Employee) super.clone();
            clone.salaries = salaries.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
