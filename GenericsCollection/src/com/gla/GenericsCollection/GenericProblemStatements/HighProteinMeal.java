package com.gla.GenericsCollection.GenericProblemStatements;

public class HighProteinMeal implements MealPlan {

    public String getMealName() {
        return "High Protein Meal";
    }

    public String toString() {
        return getMealName();
    }
}