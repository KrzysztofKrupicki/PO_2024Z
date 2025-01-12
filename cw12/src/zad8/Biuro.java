package zad8;

public class Biuro {
    private Printer printer;

    public Biuro(Printer printer) {
        this.printer = printer;
    }

    public void drukujDokument(String text){
        printer.drukuj(text);
    }
}
