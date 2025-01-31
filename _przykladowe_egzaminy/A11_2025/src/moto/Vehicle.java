package moto;

public class Vehicle implements Comparable<Vehicle> {
    private String model;
    private double speed;

    public Vehicle(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Vehicle o) {
        int modelComparation = model.compareTo(o.model);
        if(modelComparation != 0){
            return modelComparation;
        }
        return Double.compare(speed, o.speed);
    }
}
