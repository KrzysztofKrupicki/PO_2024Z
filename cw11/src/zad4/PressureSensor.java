package zad4;

public class PressureSensor implements Sensor{

    @Override
    public double readValue() {
        return 1004;
    }

    @Override
    public String getStatus() {
        return "Czujnik ciśnienia działa";
    }

    @Override
    public void reset() {
        System.out.println("Czujnik ciśnienia zresetowany");
    }
}
