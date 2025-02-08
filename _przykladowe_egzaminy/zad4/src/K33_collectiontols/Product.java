package K33_collectiontols;

import java.util.Objects;

public class Product {
    private String productName;
    private String category;

    public Product(String productName, String category) {
        this.productName = productName;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productName);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
