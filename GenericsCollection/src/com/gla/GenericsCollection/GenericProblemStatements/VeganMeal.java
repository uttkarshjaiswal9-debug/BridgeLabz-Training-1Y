package com.gla.GenericsCollection.GenericProblemStatements;

public class VeganMeal implements MealPlan {

    public String getMealName() {
        return "Vegan Meal";
    }

    public String toString() {
        return getMealName();
    }
}
