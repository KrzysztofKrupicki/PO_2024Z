package cw3.zad6;

import java.time.Year;

public class Car {
    public String brand;
    public String model;
    public int productionYear;

    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public Car(String brand, String model) {
//        this(brand, model, Calendar.getInstance().get(Calendar.YEAR));
        this(brand, model, Year.now().getValue());
    }
}
