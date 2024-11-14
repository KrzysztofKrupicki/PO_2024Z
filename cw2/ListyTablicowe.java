package cw2;

import java.util.ArrayList;

public class ListyTablicowe {
    public static int minimumValue(ArrayList<Integer> lista) {
        int minimum = lista.getFirst();
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < minimum) minimum = lista.get(i);
        }
        return minimum;
    }

    public static double average(ArrayList<Double> lista) {
        if (lista.isEmpty()) return 0;
        double sum = 0;
        for (Double aDouble : lista) {
            sum += aDouble;
        }
        return sum / lista.size();
    }

    public static int countZeros(ArrayList<Integer> lista) {
        int counter = 0;
        for (Integer integer : lista) {
            if (integer == 0) counter++;
        }
        return counter;
    }
}
