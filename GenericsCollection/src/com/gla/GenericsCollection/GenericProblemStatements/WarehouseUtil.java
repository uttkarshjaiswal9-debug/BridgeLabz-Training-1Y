package com.gla.GenericsCollection.GenericProblemStatements;

import java.util.*;

public class WarehouseUtil {

    public static void displayItems(List<? extends WarehouseItem> list) {

        for (WarehouseItem item : list) {
            System.out.println(item);
        }
    }
}