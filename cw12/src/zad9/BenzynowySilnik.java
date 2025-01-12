package zad9;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Uruchomiono silnik benzynowy.");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymano silnik benzynowy.");
    }
}
