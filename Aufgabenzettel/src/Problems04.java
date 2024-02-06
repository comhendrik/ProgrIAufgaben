import java.util.ArrayList;
import java.util.Collections;

public class Problems04 {
    public static void main(String[] args) {
        ArrayList<Double> test = new ArrayList<>();
        test.add(3.0);
        test.add(4.0);
        test.add(1.0);
        test.add(8.0);
        test.add(4.0);
        System.out.println(sumValuesInRange(test, 3.0, 4.0));
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(6);
        list2.add(7);
        System.out.println(list2);
        sort(list2);
        System.out.println(list2);
        System.out.println(merge(list1, list2));
        int[] data = new int[6];
        data[0] = 1;
        data[1] = 1;
        data[2] = 1;
        data[3] = 1;
        data[4] = 1;
        data[5] = 1;

    }

    //Problem
    public static long computeFaculty(int number) {
        int faculty = 1;
        for (int i=2; i<=number; i++) {
            faculty *= i;
        }
        return faculty;
    }

    public static boolean isPrimeNumber(long number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i * i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Problem 2

    public static double sumValuesInRange(ArrayList<Double> list, double min, double max) {
        int sum = 0;
        for (int i=0; i<list.size();i++) {
            if (min <= list.get(i) && list.get(i) <= max) sum += list.get(i);
        }
        return sum;
    }

    //Problem 3

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }



    //Problem 4

    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();


        int minLength = list1.size() < list2.size() ? list1.size() : list2.size();
        for (int i = 0; i < minLength; i++) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(i));
        }

        if (list1.size() > minLength) {
            for (int i = minLength; i < list1.size(); i++) {
                mergedList.add(list1.get(i));
            }
        } else if (list2.size() > minLength) {
            for (int i = minLength; i < list2.size(); i++) {
                mergedList.add(list2.get(i));
            }
        }

        return mergedList;
    }

    // Problem 5



    // Problem 6

    public static String[] split(String line, char splitChar) {
        return line.split(String.valueOf(splitChar));
    }
}
