package zad7;

import java.util.ArrayList;
import java.util.Objects;

public class Desktop extends Computer{
    public String caseType;

    public Desktop(String manufacturer, String model, ArrayList<Double> partsPrices, String caseType) {
        super(manufacturer, model, partsPrices);
        this.caseType = caseType;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Desktop desktop)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getCaseType(), desktop.getCaseType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCaseType());
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "caseType='" + caseType + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", partsPrices=" + partsPrices +
                '}';
    }
}
