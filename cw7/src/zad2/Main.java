package zad2;

public class Main {
    public static void main(String[] args) {
        int[] tablica = {3,7,-1,10,-8,-3};
        System.out.println(oddElementsSum(tablica));
    }

    public static int oddElementsSum(int[] tablica) {
        int suma = 0;
        for (int element : tablica) {
            if (element % 2 != 0) suma += element;
        }
        return suma;
    }
}
