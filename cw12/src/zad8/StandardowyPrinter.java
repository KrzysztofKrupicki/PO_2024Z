package zad8;

public class StandardowyPrinter implements Printer{
    @Override
    public void drukuj(String text) {
        System.out.println("Wydrukowano w StandardowyPrinter: " + text);
    }
}
