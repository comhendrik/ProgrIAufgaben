package learn;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Ingredient igr1 = new Ingredient("Mais", 10);
        Ingredient igr2 = new Ingredient("Salami", 10);
        ArrayList<Ingredient> ingredientsList1 = new ArrayList<>();
        ingredientsList1.add(igr1);
        ingredientsList1.add(igr2);

        ArrayList<Ingredient> ingredientsList2 = new ArrayList<>();
        ingredientsList2.add(igr2);
        ingredientsList2.add(igr1);

        Meal meal1 = new Meal("Pizza", ingredientsList1);
        Meal meal2 = new Meal("Pizza", ingredientsList2);

        System.out.println(meal1.equals(meal2));
    }
}
