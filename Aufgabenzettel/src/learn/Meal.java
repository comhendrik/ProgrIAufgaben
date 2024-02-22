package learn;

import java.util.ArrayList;

public class Meal {

    private String name;

    private ArrayList<Ingredient> ingredients;

    public Meal(String name) {
        this(name, new ArrayList<>());
    }

    public Meal(String name, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public boolean equals(Meal other) {
        if (!this.name.equals(other.name)) return false;
        if (this.ingredients.size() != other.ingredients.size()) return false;
        for (Ingredient igr : other.ingredients) {
            if (!this.ingredients.contains(igr)) return false;
        }
        return true;
    }
}
