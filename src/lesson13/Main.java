package lesson13;

import lesson12.MyException;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int today_meal = random.nextInt(Meal.values().length) - 1;
        int taste = random.nextInt(1);

        try {
            //System.out.println(Meal.values()[today_meal]);
            Child.eat(today_meal, taste);
        } catch (ArrayIndexOutOfBoundsException | MealException ex) {
            System.out.println(ex + "");
        } finally {
            System.out.println("Спасибо, мам!");
        }
    }
}
