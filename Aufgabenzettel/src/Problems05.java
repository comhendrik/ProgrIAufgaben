import objects.Student;

import java.util.ArrayList;

public class Problems05 {

    public static void main(String[] args) {
        Student student1 = new Student(123, "Hendrik");
        Student student2 = new Student(123, "Hendrik");
        Student student3 = new Student(223, "Hendik");
        Boolean result = studentIsEqual(student1,student2);
        System.out.println(result);
        ArrayList<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        bubbleSort(listOfStudents);
        System.out.println(listOfStudents);

    }

    //Problem 01
    public static boolean studentIsEqual(Student student1, Student student2) {
        //first check every value if they are not equal, then check the last value if its equal and return value
        if(student1.getMatrikelnummer() != student2.getMatrikelnummer()) return false;
        if(!student1.getName().equals(student2.getName())) return false;
        return student1.getCreditPoints() == student2.getCreditPoints();
    }

    // Problem 02

    public static void bubbleSort(ArrayList<Student> list) {
        int i, j;
        Student temp;
        boolean swapped;
        for (i = 0; i < list.size() - 1; i++) {
            swapped = false;
            for (j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getMatrikelnummer() > list.get(j+1).getMatrikelnummer()) {

                    // Swap
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,temp);
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }
}
