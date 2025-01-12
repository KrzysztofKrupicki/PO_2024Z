package zad9;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod(new BenzynowySilnik());
        samochod.start();
        samochod.stop();
    }
}
