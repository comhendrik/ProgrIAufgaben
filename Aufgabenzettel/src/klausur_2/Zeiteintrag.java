package klausur_2;

public class Zeiteintrag implements Comparable<Zeiteintrag> {

    private int laufendeNummer;
    private long beginn;

    private long ende;

    private String bemerkung;

    private boolean abrechenbar;

    public Zeiteintrag(int laufendeNummer, long beginn) {
        setLaufendeNummer(laufendeNummer);
        this.beginn = beginn;
        this.ende = -1;
    }

    public int getLaufendeNummer() {
        return laufendeNummer;
    }

    public void setLaufendeNummer(int laufendeNummer) {
        if (laufendeNummer < 0) throw new RuntimeException("Laufende Nummer ist negativ");
        this.laufendeNummer = laufendeNummer;
    }

    public long getBeginn() {
        return beginn;
    }

    public void setBeginn(long beginn) {
        this.beginn = beginn;
    }

    public long getEnde() {
        return ende;
    }

    public void setEnde(long ende) {
        this.ende = ende;
    }

    public String getBemerkung() {
        return bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public boolean isAbrechenbar() {
        return abrechenbar;
    }

    public void setAbrechenbar(boolean abrechenbar) {
        this.abrechenbar = abrechenbar;
    }

    public double getDauer() {
        if (ende < 0) return 0.0;
        long differenz = ende - beginn;
        long stunden = differenz / 3600;
        long minuten = (differenz % 3600) / 60;
        long sekunden = differenz % 60;
        System.out.println(stunden);
        System.out.println(minuten / 60);
        return stunden + (minuten / 60.0) + (sekunden / 3600.0);

    }

    @Override
    public String toString() {
        String s = "Start: " + this.beginn + " Ende: ";
        if (this.ende < 0) {
            s += "--";
        } else {
            s += this.ende;
        }
        s += " Bemerkung: " + this.bemerkung;
        return s;
    }

    public boolean überdeckt(Zeiteintrag other) {
        if (other.ende < 0) return this.ende < other.beginn;
        return this.ende < other.beginn && other.ende < this.beginn;
    }

    public boolean eintragKannHinzugefügtWerden(Zeiteintrag other) {
        if (this.ende > 0) return true;
        return other.ende > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zeiteintrag that = (Zeiteintrag) o;

        return laufendeNummer == that.laufendeNummer;
    }

    @Override
    public int hashCode() {
        return laufendeNummer;
    }

    @Override
    public int compareTo(Zeiteintrag o) {
        return Long.compare(this.laufendeNummer,o.laufendeNummer);
    }
}
