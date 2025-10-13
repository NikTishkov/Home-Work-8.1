package org.skypro.skyshop.product;

public abstract class Product {
    private String nameProduct;

    public Product(String nameProduct) {
        if (nameProduct == null || nameProduct.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя продукта не должно быть пустым.");
        }
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public abstract double getPriceProduct();

    public abstract boolean isSpecial();

    @Override
    public String toString() {
        return nameProduct + ": " + getPriceProduct() + " руб.";
    }
}
