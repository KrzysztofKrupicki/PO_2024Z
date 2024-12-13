package zad2;

public class Television extends ElectronicDevice {
    public Television(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Television " + manufacturer + " " + model + " turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Television " + manufacturer + " " + model + " turned off");
    }
}
