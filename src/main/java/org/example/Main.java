package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Учим java общаться по-русски
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Product laptop = ProductFactory.createProduct("Electronics", "Ноутбук", 1200.00);
        Product tShirt = ProductFactory.createProduct("Clothing", "Футболка", 25.99);
        Product apple = ProductFactory.createProduct("Food", "Яблоко", 1.49);
        Product bourbon = ProductFactory.createProduct("Alcohol", "Бурбон", 400);

        laptop.showInfo();
        tShirt.showInfo();
        apple.showInfo();
        bourbon.showInfo();
    }
}
