package org.example;

public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void showInfo();

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
