package zad10;

public class Email implements Powiadomienie{
    @Override
    public void wyslij(String wiadomosc) {
        System.out.println("Wysłano wiadomość email o treści: " + wiadomosc);
    }
}
