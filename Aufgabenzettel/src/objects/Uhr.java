package objects;

public class Uhr {


    // Verwenden Sie für die Zeitspeicherung statt des Attributs
    // 'gesamtSekunden' drei einzelne Attribute 'stunde', 'minute', 'sekunde'.
    // Welche Methoden muessen Sie entsprechend anpassen?
    private long gesamtSekunden;

    public Uhr() {
    }

    public Uhr(long sekunde) {
        this.gesamtSekunden = sekunde;
    }

    public void tick() {
        gesamtSekunden++;
    }

    public long getStunde() {
        return gesamtSekunden / 3600;
    }

    public long getMinute() {
        // "Stunden abschneiden"
        // 1h:20m:30s = 1*60*60 + 20*60 + 30 = 4830
        // 4830 % 3600 = 1230
        // 1230 / 60 = 20,5 (cast nach long ergibt 20)
        return (gesamtSekunden % 3600) / 60;
    }

    public long getSekunde() {
        // "Stunden und Minuten abschneiden"
        // 1h:20m:30s = 1*60*60 + 20*60 + 30 = 4830
        // 4830 % 60 = 30
        return gesamtSekunden % 60;
    }

    public long getGesamtSekunden() {
        return gesamtSekunden;
    }

    public void setStunde(long stunde) {
        this.gesamtSekunden = stunde * 3600 + getMinute() * 60 + getSekunde();
    }

    public void setMinute(long minute) {
        this.gesamtSekunden = getStunde() * 3600 + minute * 60 + getSekunde();
    }

    public void setSekunde(long sekunde) {
        this.gesamtSekunden = getStunde() * 3600 + getMinute() * 60 + sekunde;
    }

    public void addSekunden(long sekunden) {
        gesamtSekunden += sekunden;
    }

    public String toString() {
        /*
         * Direkte Zeitausgabe ohne führende Null
         */
        return getStunde() + ":" + getMinute() + ":" + getSekunde();
    }

    public int compare(Uhr uhr) {
        if (uhr.getGesamtSekunden() > this.gesamtSekunden) return -1;
        if (uhr.getGesamtSekunden() < this.gesamtSekunden) return 1;
        return 0;
    }

    public int computeDifference(int hours, int minutes, int seconds) {
        int overallSeconds = hours * 3600;
        overallSeconds += minutes * 60;
        overallSeconds += seconds;
        return (int) (this.gesamtSekunden - overallSeconds);
    }

    public int computeDifference(Uhr uhr2) {
        return (int) (this.gesamtSekunden - uhr2.getGesamtSekunden());
    }


}