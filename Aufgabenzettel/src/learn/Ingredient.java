package learn;

import java.util.Objects;

public class Ingredient {

    private int kcal;
    private String name;

    //Score is from 1 the best to 5 the worst
    private int score;

    public Ingredient(String name, int kcal) {
        this.name = name;
        setKcal(kcal);

    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
        if (kcal < 10) {
            score = 1;
        } else if (kcal < 20) {
            score = 2;
        } else if (kcal < 50) {
            score = 3;
        } else if (kcal < 100) {
            score = 4;
        } else {
            score = 5;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return "Ingredient{" +
                "kcal=" + kcal +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public boolean equals(Ingredient other) {
        if (kcal != other.kcal) return false;
        if (score != other.score) return false;
        return name.equals(other.name);
    }
}
