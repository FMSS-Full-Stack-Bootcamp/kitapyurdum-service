package model;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private String name;
    private BigDecimal amount;
    private String description;
    private Publisher publisher;

    private Product() {
    }

    public Product(String name, BigDecimal amount, String description, Publisher publisher) {
        this.name = name;
        this.amount = amount;
        this.description = description;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", publisher=" + publisher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, description, publisher);
    }
}
