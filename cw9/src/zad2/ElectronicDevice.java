package zad2;

public abstract class ElectronicDevice {
    String manufacturer;
    String model;
    int productionYear;

    public ElectronicDevice(String manufacturer, String model, int productionYear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.productionYear = productionYear;
    }

    public abstract void turnOn();

    public abstract void turnOff();
}
