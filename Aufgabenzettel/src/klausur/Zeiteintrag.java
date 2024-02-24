package klausur;

public class Zeiteintrag implements Comparable {

    private long begin;

    private long end;

    private int laufendeNummer;

    private boolean abrechenbar;

    private String bemerkung;

    private static int anzahl;

    public Zeiteintrag(long begin, int laufendeNummer) {
        this.begin = begin;
        this.end = -1;
        this.laufendeNummer = laufendeNummer;
    }

    public long getBegin() {
        return begin;
    }

    public void setBegin(long begin) {
        this.begin = begin;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public int getLaufendeNummer() {
        return laufendeNummer;
    }

    public void setLaufendeNummer(int laufendeNummer) {
        this.laufendeNummer = laufendeNummer;
    }

    public boolean isAbrechenbar() {
        return abrechenbar;
    }

    public void setAbrechenbar(boolean abrechenbar) {
        this.abrechenbar = abrechenbar;
    }

    public String getBemerkung() {
        return bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Zeiteintrag.anzahl = anzahl;
    }

    public double getDauer() {
        if (end < 0) return -1;
        long zeitdifferenz = end - begin;
        long stunden = zeitdifferenz / 3600;
        long minuten = (zeitdifferenz % 3600) / 60;
        long sekunden = zeitdifferenz % 60;
        double gesamtZeit = stunden + (minuten / 60.0) + (sekunden / 3600.0);

        return (double) gesamtZeit;
    }

    @Override
    public String toString() {
        String s = "Start: "+ this.begin + "Ende: ";
        if (end < 0) {
            s += "--";
        } else {
            s += this.end;
        }
        s += " Bemerkung: " + this.bemerkung;
        return s;
    }

    public boolean equals(Zeiteintrag other) {
        return this.laufendeNummer == other.laufendeNummer;
    }

    @Override
    public int compareTo(Object o) {

        Zeiteintrag other = (Zeiteintrag) o;

        if(this.getBegin() > other.getBegin()){
            return 1;
        }
        else if(this.getBegin() < other.getBegin()){
            return -1;
        }
        else{
            return 0;
        }
    }

    public boolean istInMonat(int jahr, int monat) {
        return true;
    }
}
