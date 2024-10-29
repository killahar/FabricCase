package products;

import org.example.Product;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Одежда: " + getName() + ", Цена: $" + getPrice());
    }
}
