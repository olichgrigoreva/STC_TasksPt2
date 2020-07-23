package lesson13;

import lesson12.MyException;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Meal today_meal = Meal.values()[random.nextInt(Meal.values().length)];

        try {
            Child.eat(today_meal);
        } catch (ArrayIndexOutOfBoundsException | MealException ex) {
            System.out.println(ex + "");
        } finally {
            System.out.println("Спасибо, мам!");
        }
    }
}
