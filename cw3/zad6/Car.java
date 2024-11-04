package zad6;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

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
        this(brand, model, Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())));
    }
}
