package zad2;

public class Radio implements MusicPlayer{

    @Override
    public void turnOn() {
        System.out.println("Radio włączone");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio wyłączone");
    }

    @Override
    public void nextTrack() {
        System.out.println("Zmieniono stację radiową");
    }
}
