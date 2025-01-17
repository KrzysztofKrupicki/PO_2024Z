package zad1;

public class Main {
    public static void main(String[] args) {
        Samochod samochodBenzynowy = new Samochod(new BenzynowySilnik());
        Samochod samochodDiesel = new Samochod(new SilnikDiesel());
        samochodBenzynowy.start();
        samochodBenzynowy.stop();
        samochodDiesel.start();
        samochodDiesel.stop();
    }
}
