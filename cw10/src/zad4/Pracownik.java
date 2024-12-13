package zad4;

import java.time.LocalDate;
import java.util.Comparator;

public class Pracownik {
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void setDataZatrudnienia(LocalDate dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return getImie() + " " + getPensja() + " " + getDataZatrudnienia();
    }
}

class PensjaComparator implements Comparator<Pracownik>{
    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        return Double.compare(o1.getPensja(), o2.getPensja());
    }
}