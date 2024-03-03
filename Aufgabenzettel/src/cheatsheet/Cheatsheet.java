package cheatsheet;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Cheatsheet implements Comparable<Cheatsheet> {
    //primitive Datentypen:

    //kein direkter Zugriff durch Subklasse
    private int zahl;

    //direkter Zugriff durch Subklasse
    //!AUFPASSEN gilt als Public für das Package -> eventuell in der Subklasse lieber mit gettern arbeiten
    protected int neueZahl;

    //Referenzvariablen

    protected ArrayList<Integer> zahlenListe;

    //Klassenattribute

    public final static int MULTIPLIKATOR = 5;

    public Cheatsheet(int zahl, int neueZahl) {
        this.zahl = zahl;
        this.neueZahl = neueZahl;
        this.zahlenListe = new ArrayList<>();
    }

    public Cheatsheet() {
        //super() nicht möglich
        this(0,0);
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }

    public int getNeueZahl() {
        return neueZahl;
    }

    public void setNeueZahl(int neueZahl) {
        this.neueZahl = neueZahl;
    }

    public ArrayList<Integer> getZahlenListe() {
        return new ArrayList<>(zahlenListe);
        //- Kein Getter für Listen (allgemein Referenztypen), da man dann diese von außen löschen kann
        // => inhaltliche Kopie zurückgeben
    }

    public void setZahlenListe(ArrayList<Integer> zahlenListe) {
        this.zahlenListe = zahlenListe;
    }

    public void sekundenBerechnen(int sekunden) {
        int stunden = sekunden / 3600;
        int minuten = (sekunden % 3600) / 60;
        int übrigeSekunden  = sekunden % 60;
    }

    public boolean switchNeueZahl() {
        switch(neueZahl) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                //default wird auch aufgerufen, weil kein break vorhanden ist
            default:
                return false;
        }
        return true;
    }

    public abstract int berechneNummern();

    @Override
    public int compareTo(Cheatsheet o) {
        //wenn this < other -> -1
        //wenn this > other -> 1
        // wenn this == other -> 0
        if (this.zahl < o.zahl) return -1;
        if (this.zahl > o.zahl) return 1;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cheatsheet that = (Cheatsheet) o;

        if (zahl != that.zahl) return false;
        if (neueZahl != that.neueZahl) return false;
        return Objects.equals(zahlenListe, that.zahlenListe);
    }

    @Override
    public int hashCode() {
        int result = zahl;
        result = 31 * result + neueZahl;
        result = 31 * result + (zahlenListe != null ? zahlenListe.hashCode() : 0);
        return result;
    }
}
//- Protected und private Unterscheidung, Protected => Man möchte die Attribute in der Subklasse direkt ansprechen Private => Ansprechbar über getter und setter, sowie super() in der initialisierung
//this() und super() nicht in einem Konstruktor verwenden
