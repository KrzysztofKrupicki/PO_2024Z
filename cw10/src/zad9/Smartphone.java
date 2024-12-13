package zad9;

import java.util.Date;

public class Smartphone implements Cloneable{
    String brand;
    Date productionDate;

    public Smartphone(String brand, Date productionDate) {
        this.brand = brand;
        this.productionDate = productionDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getProductionDate();
    }

    @Override
    public Smartphone clone() {
        try {
            Smartphone clone = (Smartphone) super.clone();
            clone.productionDate = (Date) productionDate.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
