package zad5;

import java.time.LocalDate;
import java.util.Comparator;

public class Product {
    String nazwa;
    double cena;
    LocalDate dataWaznosci;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }

    public void setDataWaznosci(LocalDate dataWaznosci) {
        this.dataWaznosci = dataWaznosci;
    }

    public Product(String nazwa, double cena, LocalDate dataWaznosci) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataWaznosci = dataWaznosci;
    }

    @Override
    public String toString() {
        return getNazwa() + " " + getCena() + " " + getDataWaznosci();
    }
}

class DataWaznosciComparator implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getDataWaznosci().compareTo(o2.getDataWaznosci());
    }
}
