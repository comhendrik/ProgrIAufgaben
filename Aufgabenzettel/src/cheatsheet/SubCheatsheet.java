package cheatsheet;

import java.util.ArrayList;

class SubCheatsheet extends Cheatsheet {
    private int weitereZahl;

    public SubCheatsheet(int zahl, int neueZahl, int weitereZahl) {
        super(zahl, neueZahl);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        //Delegation an die Superklasse
        if (!super.equals(o)) return false;

        SubCheatsheet that = (SubCheatsheet) o;

        return weitereZahl == that.weitereZahl;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + weitereZahl;
        return result;
    }

    @Override
    public String toString() {
        //Alle private Attribute der Superklasse werden nicht generiert
        //-> Verwendung von gettern manuell
        return "SubCheatsheet{" +
                "weitereZahl=" + weitereZahl +
                ", neueZahl=" + neueZahl +
                ", zahlenListe=" + zahlenListe +
                '}';
    }

}
