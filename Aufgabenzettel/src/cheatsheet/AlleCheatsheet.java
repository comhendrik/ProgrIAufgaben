package cheatsheet;

import java.util.ArrayList;
import java.util.Collections;

public class AlleCheatsheet {
    private ArrayList<Cheatsheet> alleCheatsheets;

    private String testString;

    public AlleCheatsheet() {
        //nicht im Konstruktor initialsieren, sondern hier
        this.alleCheatsheets = new ArrayList<>();
        //this.testString = "test";
        //Dies ist nicht notwendig, wenn für testString kein Parameter im Konstruktor ist
        // -> kein default value, einfach auf null lassen
    }

    public void sortiereInternesArray() {
        Collections.sort(alleCheatsheets);
    }

    public boolean cheatsheetIstInListe(Cheatsheet c) {
        //benötigt equals-Methode beim Cheatsheet
        return alleCheatsheets.contains(c);
    }
}
