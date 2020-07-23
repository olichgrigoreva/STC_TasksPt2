package lesson13;

public class Child {
    static void eat(Meal today_meal) throws MealException {

        if (today_meal.isPreferences()) {
            System.out.println("съел " + today_meal.getTitle() + " за обе щеки");
        } else {
            System.out.println(today_meal.getTitle());
            throw new MealException("Не вкусно!");
        }
    }
}
