package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

public abstract class FixPriceProduct extends Product {
    private static final int FIXED_PRICE = 350;

    public FixPriceProduct(String nameProduct) {
        super(nameProduct);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public double getPriceProduct() {
        return FIXED_PRICE;
    }

    @Override
    public String toString() {
        return getNameProduct() + ": Фиксированная цена " + FIXED_PRICE + " руб.";
    }
}
