package org.skypro.skyshop.product;

public class Product {
    private String nameProduct;
    private int priceProduct;

    public Product(String nameProduct, int priceProduct) {
        if (nameProduct == null || nameProduct.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя продукта не должно быть пустым.");
        }
        if (priceProduct < 0) {
            throw new IllegalArgumentException("Цена не должна быть отрицательной.");
        }

        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }
}
