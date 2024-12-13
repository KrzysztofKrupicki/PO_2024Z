package zad2;

public class Order implements Comparable<Order> {
    String productName;
    int quantity;
    double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return getProductName() + " " + getQuantity() + " " + getUnitPrice();
    }

    @Override
    public int compareTo(Order o) {
        if (Double.compare(this.getUnitPrice(), o.getUnitPrice()) == 0) {
            return Integer.compare(this.getQuantity(), o.getQuantity());
        }
        return Double.compare(o.getUnitPrice(), this.getUnitPrice());
    }
}
