package cw7.zad1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>(Arrays.asList(4.13, 7.21, 21.37, 1.73, 4.20));
        System.out.println(minimumValue(lista));
    }

    public static double minimumValue(ArrayList<Double> lista) {
        double min = lista.getFirst();
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < min) min = lista.get(i);
        }
        return min;
    }
}
