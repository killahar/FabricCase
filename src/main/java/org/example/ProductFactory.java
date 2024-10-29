package org.example;

import products.GenericProduct;

public class ProductFactory {

    public static Product createProduct(String productType, String name, double price) {
        String className = "products." + productType;

        try {
            // Пытаемся загрузить указанный класс
            Class<?> clazz = Class.forName(className);

            if (Product.class.isAssignableFrom(clazz)) {
                // Создаем экземпляр продукта, если класс найден
                return (Product) clazz.getDeclaredConstructor(String.class, double.class)
                        .newInstance(name, price);
            } else {
                throw new IllegalArgumentException("Класс " + productType + " не является продуктом");
            }
        } catch (ClassNotFoundException e) {
            // Если класс не найден, возвращаем универсальный продукт
            return new GenericProduct(productType, name, price);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка создания продукта: " + e.getMessage());
        }
    }
}
