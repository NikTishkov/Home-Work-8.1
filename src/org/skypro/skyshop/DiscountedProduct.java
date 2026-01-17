package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

public class DiscountedProduct extends Product {
    private double basicPrice;
    private int discount;

    public DiscountedProduct(String nameProduct, double basicPrice, int discount) {
        super(nameProduct);
        this.basicPrice = basicPrice;
        this.discount = Math.max(0, Math.min(100, discount));
    }

    @Override
    public double getPriceProduct() {
        return (basicPrice * (1 - discount / 100.0));
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getNameProduct() + ": " + getPriceProduct() + " руб. С учетом скидки в " + discount + "%.";
    }
}
