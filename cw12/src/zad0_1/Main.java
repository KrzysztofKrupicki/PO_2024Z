package zad0_1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Filemon");
        Animal animal2 = new Animal("Burek");
        Box<Animal, Animal> animalBox = new Box<>(animal, animal2);
        System.out.println(animalBox.getValue());
        animalBox.getValue().dajGlos();
        System.out.println(animalBox.getValue2());
        animalBox.getValue2().dajGlos();

        String napis = "Cześć";
        Box<Animal, String> animalStringBox = new Box<>(animal, napis);

//        wypisz(napis);
        wypisz(animal);
    }

    public static <T extends Animal> void wypisz(T value) {
        System.out.println(value);
    }
}
