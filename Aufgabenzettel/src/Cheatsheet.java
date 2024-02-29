import java.util.ArrayList;

public abstract class Cheatsheet {

    //primitive Datentypen:

    //kein direkter Zugriff durch Subklasse
    private int zahl;

    //direkter Zugriff durch Subklasse
    protected int neueZahl;

    //Referenzvariablen

    protected ArrayList<Integer> zahlenListe;

    //Klassenattribute

    public final static int MULTIPLIKATOR = 5;

    public Cheatsheet(int zahl, int neueZahl, ArrayList<Integer> zahlenListe) {
        this.zahl = zahl;
        this.neueZahl = neueZahl;
        this.zahlenListe = zahlenListe;
    }

    public Cheatsheet(ArrayList<Integer> zahlenListe) {
        //super() nicht möglich
        this(0,0,zahlenListe);
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
        return (ArrayList<Integer>) zahlenListe.clone();
        //- Kein Getter für Listen (allgemein Referenztypen), da man dann diese von außen löschen kann
        // => inhaltliche Kopie zurückgeben
    }

    public void setZahlenListe(ArrayList<Integer> zahlenListe) {
        this.zahlenListe = zahlenListe;
    }

    public abstract int berechneNummern();
}


//public steht hier im normal Fall auch
//diesmal nicht wegen der einen Datei
class SubCheatsheet extends Cheatsheet {
    private int weitereZahl;

    public SubCheatsheet(int zahl, int neueZahl, ArrayList<Integer> zahlenListe, int weitereZahl) {
        super(zahl, neueZahl, zahlenListe);
        setWeitereZahl(weitereZahl);
    }

    @Override
    public int berechneNummern() {
        return getZahl() * neueZahl * weitereZahl * MULTIPLIKATOR;
        //get Zahl wegen der Sichtbarkeit
    }

    public int getWeitereZahl() {
        return weitereZahl;
    }

    public void setWeitereZahl(int weitereZahl) {
        if (weitereZahl < 0) throw new RuntimeException("Zahl kleiner 0");
        this.weitereZahl = weitereZahl;
    }
}



//- Protected und private Unterscheidung, Protected => Man möchte die Attribute in der Subklasse direkt ansprechen Private => Ansprechbar über getter und setter, sowie super() in der initialisierung
//this() und super() nicht in einem Konstruktor verwenden
