package zad1;

public class BenzynowySilnik implements Silnik{

    @Override
    public void uruchom() {
        System.out.println("Silnik benzynowy uruchomiony");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Silnik benzynowy zatrzymany");
    }
}
