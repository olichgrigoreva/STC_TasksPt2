package lesson13;

import java.util.Random;

public class Child {
    static void eat(int today_meal) throws MealException {
        Meal child_eat = Meal.values()[today_meal];
        int meal_preference = child_eat.getPreferences();
        if (meal_preference == 1) {
            System.out.println("съел " + child_eat.getTitle() + " за обе щеки");
        } else {
            throw new MealException("Не вкусно!");
        }
    }
}
