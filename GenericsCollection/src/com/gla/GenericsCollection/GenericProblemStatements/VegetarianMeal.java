package com.gla.GenericsCollection.GenericProblemStatements;

public class VegetarianMeal implements MealPlan {

    public String getMealName() {
        return "Vegetarian Meal";
    }

    public String toString() {
        return getMealName();
    }
}
