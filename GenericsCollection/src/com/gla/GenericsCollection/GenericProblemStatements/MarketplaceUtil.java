package com.gla.GenericsCollection.GenericProblemStatements;

public class MarketplaceUtil {

    public static <T extends GenericProduct<?>> void applyDiscount(T product, double percentage) {

        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}
