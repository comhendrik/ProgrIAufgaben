import Prog1Tools.IOTools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problems03 {
    public static void main(String[] args) {
        problem4();

    }

    public static void problem1() {
        ArrayList<Integer> listeA = new ArrayList<>();
        ArrayList<Integer> listeB = new ArrayList<>();
        boolean anotherValue;
        do {
            listeA.add(IOTools.readInt("Value for List a: "));
            listeB.add(IOTools.readInt("Value for List b: "));
            anotherValue = IOTools.readBoolean("Do you want to read another two values? Enter true or false: ");
        } while(anotherValue);

        for (int i=0; i<listeA.size(); i++) {
            if (listeA.get(i) != listeB.get(i)) System.out.print("Not ");
        }
        System.out.print("equal");
    }

    public static void problem2() {
        int n = IOTools.readInt("How values do you want to read? ");
        if (n==0) return;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            list.add(IOTools.readInt("Value " + (i+1) + ": "));
        }
        int min, max;
        min = max = list.get(0);

        int comparingValue;
        for (int i=1; i<list.size(); i++) {
            comparingValue = list.get(i);
            if (comparingValue < min) min = comparingValue;
            else if (comparingValue > max) max = comparingValue;
        }

        System.out.println("Min: " + min + ", Max: " + max);

    }

    public static void problem3() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            list.add(i);
        }

        Collections.shuffle(list); //Keine Anwendung von Math.random();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("All indexes of values above 20");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 20) System.out.println(i);
        }
    }

    public static void problem4() {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        int n = IOTools.readInt("How many values do you want to read? ");

        for (int i=0; i<n; i++) {
            listA.add(IOTools.readInt("Value " + (i+1) + ": "));
        }

        System.out.println("listA Size: " + listA.size());
        System.out.println("listB Size: " + listB.size());
        System.out.println("Switching values...");



        int value;

        while(!listA.isEmpty()) {
            value = listA.remove(0);
            boolean isAdded = false;
            for (int i = 0; i< listB.size(); i++) {
                if (listB.get(i) > value) {
                    listB.add(i, value);
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded) listB.add(value);

        }

        System.out.println("listA Size: " + listA.size());
        System.out.println(listA);
        System.out.println("listB Size: " + listB.size());
        System.out.println(listB);

    }

    public static void problem5() {
        String str;
        str = IOTools.readLine("Line: ");
        ArrayList<String> allStrings = new ArrayList<>();
        while (!str.isEmpty()) {
            allStrings.add(str);
            str = IOTools.readLine("Line: ");
        }
        System.out.println(allStrings);
        ArrayList<String> absoluteStrings = new ArrayList<>();
        String comparingString;
        for (int i=0; i<allStrings.size(); i++) {
            comparingString = allStrings.get(i);
            if (!absoluteStrings.contains(comparingString)) absoluteStrings.add(comparingString);
        }
        System.out.println(absoluteStrings);

    }

    public static void problem6() {
        int n = IOTools.readInt("No. of values: ");
        if (n==0) return;
        int[] list = new int[n];

        for (int i=0; i<list.length; i++) {
            list[i] = IOTools.readInt("No. " + (i+1) + ": ");
        }

        System.out.println("Order before changing:");
        for (int i=0; i<list.length; i++) {
            System.out.println(list[i]);
        }

        int changeValue;
        for (int i=0; i<list.length/2; i++) {
            changeValue = list[i];
            list[i] = list[list.length - (i + 1)];
            list[list.length - (i + 1)] = changeValue;
        }

        System.out.println("Order after changing:");
        for (int i=0; i<list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void problem7() {
        String str = IOTools.readLine("Enter String: ");
        try {
            int n = Integer.parseInt(str);
            long stringAsLong = Long.parseLong(str);
            System.out.println(stringAsLong);
        } catch (NumberFormatException e) {
            System.out.println("No Number");
        }

    }

}
