package products;

import org.example.Product;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Электроника: " + getName() + ", Цена: $" + getPrice());
    }
}

