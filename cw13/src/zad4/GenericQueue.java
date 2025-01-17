package zad4;

import java.util.ArrayList;

public class GenericQueue<T> {
    private ArrayList<T> elements = new ArrayList<>();

    public void enqueue(T element) {
        elements.addLast(element);
    }

    public T dequeue() {
        T first = elements.getFirst();
        elements.remove(0);
        return first;
    }

    @Override
    public String toString() {
        return "GenericQueue{" +
                "elements=" + elements +
                '}';
    }
}
