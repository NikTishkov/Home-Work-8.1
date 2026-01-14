package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

public abstract class SimpleProduct extends Product {
    private double priceProduct;

    public SimpleProduct(String nameProduct, double priceProduct) {
        super(nameProduct);
        this.priceProduct = priceProduct;
        if (priceProduct < 0) {
            throw new IllegalArgumentException("Цена не должна быть отрицательной.");
        }
    }

    @Override
    public double getPriceProduct() {
        return priceProduct;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }
}
