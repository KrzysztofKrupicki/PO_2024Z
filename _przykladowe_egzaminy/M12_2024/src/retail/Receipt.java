package retail;

import java.util.ArrayList;

public class Receipt implements Cloneable{
    private String number;
    private ArrayList<Double> amounts;

    public Receipt(String number, ArrayList<Double> amounts) {
        this.number = number;
        this.amounts = new ArrayList<>(amounts);
    }

    public Receipt(){
        this.number = "AA";
        this.amounts = new ArrayList<>();
    }

    public void changeAmountAtFirstPosition(Double newValue){
        amounts.set(0, newValue);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "number='" + number + '\'' +
                ", amounts=" + amounts +
                '}';
    }

    @Override
    public Receipt clone() {
        try {
            Receipt clone = (Receipt) super.clone();
            clone.amounts = new ArrayList<>(amounts);
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
