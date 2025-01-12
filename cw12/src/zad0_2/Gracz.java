package zad0_2;

public class Gracz {
    Weapon bron;

    public Gracz(Weapon bron) {
        this.bron = bron;
    }

    public void zaatakuj() {
        bron.attack();
    }

    public void setBron(Weapon bron) {
        this.bron = bron;
    }
}
