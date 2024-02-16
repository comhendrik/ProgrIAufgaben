package liveWeek6;


//Klassenbeziehungen, genau so wie die Klasse Modul

public class Client2 {

    public static void main(String[] args) {
        Modul prog1 = new Modul("Prog 1", "Prieß");
        System.out.println(prog1);

        Student student1 = new Student(123, "Hendrik", 0);
    }
}
