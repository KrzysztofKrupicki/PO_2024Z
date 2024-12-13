package zad2;

public class Smartphone extends ElectronicDevice {
    public Smartphone(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Smartphone " + manufacturer + " " + model + " turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone " + manufacturer + " " + model + " turned off");
    }
}
