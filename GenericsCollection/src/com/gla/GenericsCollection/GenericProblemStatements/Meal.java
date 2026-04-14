package com.gla.GenericsCollection.GenericProblemStatements;

public class Meal<T extends MealPlan> {

    private T meal;

    public void setMeal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }
}
