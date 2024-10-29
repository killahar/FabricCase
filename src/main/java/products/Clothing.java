package products;

import org.example.Product;

public class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Одежда: " + getName() + ", Цена: $" + getPrice());
    }
}
