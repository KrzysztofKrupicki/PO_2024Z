package cw7.zad6;

import java.time.Year;
import java.util.Objects;

public class Vehicle {
    String brand;
    String model;
    int yearOfProduction;

    public Vehicle(String brand, String mdoel, int yearOfProduction) {
        if (brand == null || brand.isEmpty()) this.brand = "";
        else this.brand = brand;
        if (mdoel == null || mdoel.isEmpty()) this.model = "";
        else this.model = mdoel;
        if (yearOfProduction > Year.now().getValue()) this.yearOfProduction = 2024;
        else this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Vehicle: %s %s, Year: %d.".formatted(brand, model, yearOfProduction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return yearOfProduction == vehicle.yearOfProduction && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }
}
