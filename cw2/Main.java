import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaLiczbCalkowitych = new ArrayList<>();
        for (int i = 3; i <= 12; i++) {
            listaLiczbCalkowitych.add(i);
        }
//        for (Integer liczbCalkowitych : listaLiczbCalkowitych.reversed()) {
//            System.out.print(liczbCalkowitych + " ");
//        }
        ArrayList<Double> listaLiczbZmiennoprzecinkowych = new ArrayList<>();
        listaLiczbZmiennoprzecinkowych.add(3.5);
        listaLiczbZmiennoprzecinkowych.add(2.7);
        ArrayList<Double> listaLiczbZmiennoprzecinkowych2 = new ArrayList<>();
        System.out.println("minimumValue: " + ListyTablicowe.minimumValue(listaLiczbCalkowitych));
        System.out.println("average: " + ListyTablicowe.average(listaLiczbZmiennoprzecinkowych));
        System.out.println("average pusta lista: " + ListyTablicowe.average(listaLiczbZmiennoprzecinkowych2));

        ArrayList<Integer> lista3 = new ArrayList<>();
        lista3.add(0);
        lista3.add(1);
        lista3.add(2);
        lista3.add(0);
        lista3.add(3);
        lista3.add(0);
        lista3.add(4);
        System.out.println("countZeros: " + ListyTablicowe.countZeros(lista3));

        System.out.println("reverseString: Witaj -> " + Napisy.reverseString("Witaj"));

        System.out.println("startAndEndWithTheSameChar: Ćześć -> " + Napisy.startAndEndWithTheSameChar("Cześć"));
        System.out.println("startAndEndWithTheSameChar: kajak -> " + Napisy.startAndEndWithTheSameChar("kajak"));
        System.out.println("replaceFirstAndLastChar: Team -> " + Napisy.replaceFirstAndLastChar("Team"));

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Wprowadź tekst: ");
//        String napis = scanner.nextLine();
//        int liczba = scanner.nextInt();
//        System.out.println(Napisy.reverseString(napis));

//        System.out.println(Napisy.piramida('*', 3));
        Napisy.piramida('*', 3);
    }
}