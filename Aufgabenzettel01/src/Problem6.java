import Prog1Tools.IOTools;

class Problem6 {

    public static void main(String[] args) {
        System.out.println("Aufgabe 6");
        int year = IOTools.readInt("Jahr eingeben");
        boolean leapYearConditionOne = year % 4 == 0;
        boolean leapYearConditionTwo = year % 100 != 0;
        boolean leapYearConditionThree = year % 400 == 0;
        System.out.println(leapYearConditionOne || leapYearConditionTwo || leapYearConditionThree);

        //going further
        System.out.println(goingFurther(year));
    }

    public static boolean goingFurther(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 != 0) return true;
        if (year % 400 != 0) return false;
        return true;
    }
}
