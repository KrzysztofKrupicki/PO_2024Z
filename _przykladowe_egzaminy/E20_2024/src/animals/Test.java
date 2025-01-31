package animals;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Filemon");
        Dog dog = new Dog("Fafik");
        Animal dog2 = new Dog("Reksio");
        System.out.println(Checker.isSameSpecies(animal, dog));
        System.out.println(Checker.isSameSpecies(dog, dog2));
    }
}
