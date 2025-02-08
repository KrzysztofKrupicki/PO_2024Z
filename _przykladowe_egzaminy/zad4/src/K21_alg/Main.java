package K21_alg;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();
        System.out.println(isListEmpty(list));
        list.add(new Person("Jan", 23));
        System.out.println(isListEmpty(list));
    }

    public static <E> boolean isListEmpty(LinkedList<E> list) {
        return list.isEmpty();
    }
}
