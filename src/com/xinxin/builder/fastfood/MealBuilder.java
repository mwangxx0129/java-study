package com.xinxin.builder.fastfood;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new NonVegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareMeal(Burger burger, ColdDrink coldDrink) {
        return new Meal().addItem(burger).addItem(coldDrink);
    }
}
