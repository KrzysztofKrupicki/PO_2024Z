package zad5;

import java.time.Year;

public class Car {
    String brand;
    String model;
    int productionYear;

    public Car(String brand, String mdoel, int productionYear) {
        if (brand == null || brand.isEmpty()) this.brand = "default";
        else this.brand = brand;
        if (mdoel == null || mdoel.isEmpty()) this.model = "";
        else this.model = mdoel;
        if (productionYear > Year.now().getValue()) this.productionYear = 2024;
        else this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
