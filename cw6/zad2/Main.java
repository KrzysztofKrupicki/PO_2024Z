package cw6.zad2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jan", "Kowalski", new Address("Wiosenna", "7", "10-401", "Olsztyn"));
        System.out.println(p1.Address());
    }
}
