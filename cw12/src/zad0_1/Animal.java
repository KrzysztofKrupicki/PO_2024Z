package zad0_1;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void dajGlos() {
        System.out.println("Hau hau");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
