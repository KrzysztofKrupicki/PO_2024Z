package zad0_2;

public class Main {
    public static void main(String[] args) {
        Gracz gracz = new Gracz(new Miecz());
        gracz.zaatakuj();
        gracz.setBron(new Jojo());
        gracz.zaatakuj();
    }
}
