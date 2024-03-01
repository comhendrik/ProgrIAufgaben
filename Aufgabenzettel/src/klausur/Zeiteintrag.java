package klausur;

public class Zeiteintrag implements Comparable<Zeiteintrag> {

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

        return gesamtZeit;
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
    public int compareTo(Zeiteintrag other) {
        return Long.compare(this.getBegin(), other.getBegin());
    }

    public boolean istInMonat(int jahr, int monat) {
        //ich betrachte nicht die Berechnung eines Schaltjahres zur Vereinfachten der Darstellung
        int aktuellesJahr = 2000;
        int aktuellerTag = 1;
        int aktuellerMonat = 1;
        long ganzeTage = begin / 86400;


        int[] maximaleTage = {31,28,31,30,31,30,31,31,30,31,30,31};
        //for schleife zum heraufzählen der Tage, Monate und Jahre
        for (long i=0; i<ganzeTage; i++) {
            aktuellerTag += 1;
            if (maximaleTage[aktuellerMonat-1] == aktuellerTag) {
                aktuellerTag = 1;
                aktuellerMonat += 1;
            }

            if (aktuellerMonat == 13) {
                aktuellerMonat = 1;
                aktuellesJahr += 1;
            }
        }

        return jahr == aktuellesJahr && monat == aktuellerMonat;
    }

    public boolean ueberdeckt(Zeiteintrag eintrag) {
        //TODO:
        if (this.getBegin() < eintrag.getBegin() && this.getEnd() > eintrag.getBegin()) return true;
        if (this.getBegin() < eintrag.getEnd() && this.getEnd() > eintrag.getEnd()) return true;
        return false;
    }

}
