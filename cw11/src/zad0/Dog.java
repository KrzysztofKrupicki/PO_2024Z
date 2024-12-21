package zad0;

public class Dog extends Animal implements LoudAnimal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Hau");
    }

    @Override
    public void sayName() {
        System.out.println("Nazywam się " + name);
    }
}

