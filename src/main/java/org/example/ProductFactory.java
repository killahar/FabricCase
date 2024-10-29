package org.example;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {

    private static final Map<String, Class<? extends Product>> productClasses = new HashMap<>();


    public static void registerProduct(String productType, Class<? extends Product> productClass) {
        productClasses.put(productType, productClass);
    }

    // Метод для создания экземпляра продукта
    public static Product createProduct(String productType, String name, double price) {
        Class<? extends Product> productClass = productClasses.get(productType);
        if (productClass == null) {
            throw new IllegalArgumentException("Тип продукта не зарегистрирован: " + productType);
        }
        try {
            return productClass.getDeclaredConstructor(String.class, double.class)
                    .newInstance(name, price);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка создания продукта: " + e.getMessage());
        }
    }
}
