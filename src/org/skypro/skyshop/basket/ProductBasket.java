package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] products;
    private int productCount;

    public ProductBasket() {
        this.products = new Product[5];
        this.productCount = 0;
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Продукт не может быть null.");
        }
        if (productCount >= products.length) {
            System.out.println("Невозможно добавить продукт.");
            return;
        }
        products[productCount] = product;
        productCount++;
    }

    public boolean containsProduct(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
            return false;
        }
        for (int i = 0; i < productCount; i++) {
            if (products[i].getNameProduct().equalsIgnoreCase(productName.trim())) {
                return true;
            }
        }
        return false;
    }

    public void printBasketContents() {
        if (productCount == 0) {
            System.out.println("В корзине пусто.");
            return;
        }
        int specialCount = 0;
        for (Product product : products) {
            System.out.println(product.toString());
            if (product.isSpecial()) {
                specialCount++;
            }
        }
        System.out.println("Итого: " + getTotalCost() + " руб.");
        System.out.println("Специальных товаров: " + specialCount);
    }

    public void clearBasket() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        productCount = 0;
    }

    public int getTotalCost() {
        int total = 0;
        for (int i = 0; i < productCount; i++) {
            total += products[i].getPriceProduct();
        }
        return total;
    }

    public int getProductCount() {
        return productCount;
    }

}
