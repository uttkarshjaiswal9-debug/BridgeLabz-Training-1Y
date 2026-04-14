package com.gla.GenericsCollection.GenericProblemStatements;

public class MealUtil {

    public static <T extends MealPlan> void generateMeal(Meal<T> meal, T plan) {

        meal.setMeal(plan);
        System.out.println("Generated: " + meal.getMeal());
    }
}
