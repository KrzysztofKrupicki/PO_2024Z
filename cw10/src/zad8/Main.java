package zad8;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jan Kowalski", new double[]{4500.00, 4000.00, 4000.00, 4000.00, 5000.00, 5000.00, 5500.00, 6000.00, 6000.00, 5500.00, 6500.00, 6500.00});
        Employee e2 = e1.clone();
        e1.salaries[5] = 7000;
        System.out.println(e1);
        System.out.println(e2);
    }
}
