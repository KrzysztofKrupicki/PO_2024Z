package zad1;

public class SilnikDiesel implements Silnik {
    @Override
    public void uruchom() {
        System.out.println("Silnik diesel uruchomiony");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Silnik diesel zatrzymany");
    }
}
