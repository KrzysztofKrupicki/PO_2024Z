package zad2;

import java.util.ArrayList;

public class Counter<T> {
    private int count = 0;
    ArrayList<T> values;


    public Counter(){
        values = new ArrayList<>();
    }
    public void add(T element) {
        values.add(element);
        count++;
    }

    public int getCount() {
        return count;
    }
}
