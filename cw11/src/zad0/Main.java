package zad0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Kicia"));
        animals.add(new Dog("Reksio"));
        animals.add(new Butterfly("Paź"));

        for (Animal a: animals) {
            if(a instanceof LoudAnimal loudAnimal){
                loudAnimal.sayName();
                loudAnimal.makeSound();
            }
        }
    }
}
