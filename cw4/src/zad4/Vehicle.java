package zad4;

import java.time.Year;
import java.util.Objects;

public class Vehicle {
    public String brand;
    public String model;
    public int yearOfProduction;

    public Vehicle(String brand, String model, int yearOfProduction) {
        if (brand == null || brand.equals("")) this.brand = "---";
        else this.brand = brand;
        if (model == null || model.equals("")) this.model = "---";
        else this.model = model;
        if(this.yearOfProduction > Year.now().getValue()) this.yearOfProduction = Year.now().getValue();
        else this.yearOfProduction = yearOfProduction;

    }

    @Override
    public String toString() {
        return "Vehicle: " + brand + " " + model + ", Year: " + yearOfProduction + ".";
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
