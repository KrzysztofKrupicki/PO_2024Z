package zad2;

public class Laptop extends ElectronicDevice {
    public Laptop(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop " + manufacturer + " " + model + " turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop " + manufacturer + " " + model + " turned off");
    }
}
