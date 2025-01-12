package zad10;

public class Uzytkownik {
    private Powiadomienie powiadomienie;

    public Uzytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }

    public void powiadomOModernizacji(String informacja){
        powiadomienie.wyslij(informacja);
    }
}
