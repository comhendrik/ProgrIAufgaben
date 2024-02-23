package learn;

public class Guest extends Human {

    private Meal orderedMeal;


    public Guest(int age, String name, String gender, Meal orderedMeal) {
        super(age, name, gender);
        this.orderedMeal = orderedMeal;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "orderedMeal=" + orderedMeal +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
