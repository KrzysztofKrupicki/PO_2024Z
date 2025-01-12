package zad8;

public class Main {
    public static void main(String[] args) {
        Biuro biuro = new Biuro(new StandardowyPrinter());
        biuro.drukujDokument("Java is gr8");
    }
}
