package zad4;

public class SensorTest {
    public static void main(String[] args) {
        TemperatureSensor ts = new TemperatureSensor();
        PressureSensor ps = new PressureSensor();
        System.out.println(ts.getStatus());
        System.out.println(ts.readValue());
        ts.reset();
        System.out.println(ps.getStatus());
        System.out.println(ps.readValue());
        ps.reset();
    }
}
