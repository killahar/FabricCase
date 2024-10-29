package products;

import org.example.Product;

public class Food extends Product {
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Продукты питания: " + getName() + ", Цена: $" + getPrice());
    }
}
