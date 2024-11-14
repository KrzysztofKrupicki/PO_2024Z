package cw5.zad0;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Adam", "Nowak");
        p1.displayData();
        Person e1 = new Employee("Jan", "Zbędny", 15000);
        e1.displayData();
    }
}