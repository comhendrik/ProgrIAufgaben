import Prog1Tools.IOTools;

class Problem6 {

    public static void main(String[] args) {
        System.out.println("Aufgabe 6");
        int year = IOTools.readInt("Jahr eingeben");
        boolean leapYearConditionOne = year % 4 == 0;
        boolean leapYearConditionTwo = (year % 4 == 0) && (year % 100 != 0);
        boolean leapYearConditionThree = year % 4 == 0 && year % 400 == 0 && year % 100 == 0;
        System.out.println(leapYearConditionOne || leapYearConditionTwo || leapYearConditionThree);
    }
}
