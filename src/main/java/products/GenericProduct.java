package products;

import org.example.Product;

public class GenericProduct extends Product {
    private final String type;

    public GenericProduct(String type, String name, double price) {
        super(name, price);
        this.type = type;
    }

    @Override
    public void showInfo() {
        System.out.println(type + ": " + getName() + ", Цена: $" + getPrice());
    }
}
