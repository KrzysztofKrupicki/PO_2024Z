package L13_printing;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("in");
        linkedList.add("Java");
        linkedList.add("world!");
        printList(linkedList);
    }

    public static <E> void printList(LinkedList<E> linkedList) {
        if (linkedList.isEmpty() || linkedList == null) {
            throw new IllegalArgumentException("Metoda nie przyjmuje pustej lub niezainicjalizowanej listy");
        }
        for (E elem : linkedList) {
            System.out.println(elem);
        }
    }
}
