package com.gla.GenericsCollection.GenericProblemStatements;

import java.util.*;

public class CourseUtil {

    public static void displayCourses(List<? extends CourseType> list) {

        for (CourseType c : list) {
            System.out.println(c);
        }
    }
}
