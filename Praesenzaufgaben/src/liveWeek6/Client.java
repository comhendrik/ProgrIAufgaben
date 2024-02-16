package liveWeek6;

public class Client {

    public static void main(String[] args) {
        Player p1 = new Player(1,0, "Hendrik");
        Player p2 = new Player(1,0, "asd");
        System.out.println(p1);

        //Objektgleichheit (Referenz)

        System.out.println(p1 == p2);

        //Inhaltliche Gleichheit
        //Die Default Implementation von .equals() ist ==

        System.out.println(p1.equals(p2));
    }
}


//Nacharbeiten:
//-klasse Modul
//  -addTeilnehmer()
//  -removeTeilnehmer()
//  -toString() (sout)
//-Klasse Student
//  -equals Methode als Duplikatprüfung
//  -Beziehungen zwischen Klassen
//-Klasse Uhr -> Uhr Mod -> Fragestellung: Warum ist Datenkapselung (Information Hiding) wichtig?
