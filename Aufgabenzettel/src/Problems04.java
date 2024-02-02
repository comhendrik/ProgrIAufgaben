import java.util.ArrayList;

public class Problems04 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(6);
        list2.add(7);
        System.out.println(merge(list1, list2));
    }


    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();


        int minLength = list1.size() < list2.size() ? list1.size() : list2.size();
        for (int i = 0; i < minLength; i++) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(i));
        }

        if (list1.size() > minLength) {
            mergedList.addAll(list1.subList(minLength, list1.size()));
        } else if (list2.size() > minLength) {
            mergedList.addAll(list2.subList(minLength, list2.size()));
        }

        return mergedList;
    }
}
