package zad4;

public class Main {
    public static void main(String[] args) {
        GenericQueue<Integer> kolejka = new GenericQueue<>();
        kolejka.enqueue(4);
        kolejka.enqueue(6);
        kolejka.enqueue(10);
        System.out.println(kolejka.dequeue());
        System.out.println(kolejka.dequeue());
        System.out.println(kolejka.dequeue());
        System.out.println(kolejka.dequeue());
    }
}
