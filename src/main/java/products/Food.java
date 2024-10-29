package products;

import org.example.Product;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Food extends Product {
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Продукты питания: " + getName() + ", Цена: $" + getPrice());
    }
}
