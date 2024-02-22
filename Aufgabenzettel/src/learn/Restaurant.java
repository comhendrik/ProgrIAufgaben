package learn;

import java.util.ArrayList;

public class Restaurant {

    private int no;

    private String name;

    private ArrayList<Meal> allMeals;


    //Classattributes
    public static int numberOfTotalRestaurants;



    public Restaurant(String name, ArrayList<Meal> allMeals) {
        numberOfTotalRestaurants++;
        no = numberOfTotalRestaurants;
        this.name = name;
        this.allMeals = allMeals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Meal> getAllMeals() {
        return allMeals;
    }

    public void setAllMeals(ArrayList<Meal> allMeals) {
        this.allMeals = allMeals;
    }

    public int getNo() {
        return no;
    }
}
