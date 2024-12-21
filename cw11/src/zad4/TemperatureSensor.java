package zad4;

public class TemperatureSensor implements Sensor{

    @Override
    public double readValue() {
        return 23.6;
    }

    @Override
    public String getStatus() {
        return "Czujnik temperatury działa";
    }

    @Override
    public void reset() {
        System.out.println("Czujnik temperatury zresetowany");
    }
}
