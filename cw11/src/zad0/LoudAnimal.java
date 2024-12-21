package zad0;

public interface LoudAnimal {
//    final static int tysiac = 1000;
    public abstract void makeSound();
    default void sayName(){
        System.out.println("Nie wiem jak sie nazywam");
    }
}
