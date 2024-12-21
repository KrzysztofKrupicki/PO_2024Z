package zad0;

public class Cat extends Animal implements LoudAnimal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Miau");
    }

    @Override
    public void sayName() {
        System.out.println("Nazywam się " + name);
    }
}
