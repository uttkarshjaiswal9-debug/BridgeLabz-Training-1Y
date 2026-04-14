package com.gla.GenericsCollection.GenericProblemStatements;

import java.util.*;

public class ScreeningUtil {

    public static void screen(List<? extends JobRole> list) {

        for (JobRole r : list) {
            System.out.println("Screened: " + r);
        }
    }
}
