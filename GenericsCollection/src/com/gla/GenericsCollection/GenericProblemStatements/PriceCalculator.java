package com.gla.GenericsCollection.GenericProblemStatements;

import java.util.*;

public class PriceCalculator {
     public static double calculateTotal(List<? extends Product> items) {
         double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
}
