package objects;


/*
 * Warum ist Kapselung so vorteilhaft?
 * - Das Innenleben der Klasse ist weitgehend geheim und von Außen nicht sichtbar.
 * - Der Zugriff von Außen funktioniert einzig und allein über Schnittstellen.
 * - Schnittstellen nach außen sind klar und fest definiert.
 * - Die Schnittstellen nach Außen ändern sich nicht.
 * - Die Implementierung innerhalb der Klasse kann geändert werden,
 *   ohne weitere Änderungen an anderen Stellen meines Projektes vornehmen zu müssen.
 * - Für die Verwendung der Klasse soll man so wenig wie möglich wissen.
 * - Es können keine internen Informationen der Klasse "ausgenutzt" werden
 *   (bspw. bei Klassen zu Datenspeicherung sollte die Art und Weise der Datenablage nach außen nicht sichtbar sein).
 * - Durch die Datenkapselung werden unfreiwillige Manipulationen verhindert.
 *
 * Unterschied zur Klasse Uhr: 	s. Aufgabenzettel 5
 * Fazit: 						s. Aufgabenzettel 5
 *
 */
public class UhrMod {

    private long sekunde;


    private long stunde;



    private long minute;

    public UhrMod() {
    }

    public UhrMod(long stunde, int minute, int sekunde) {
        this.sekunde = sekunde;
        this.minute = minute;
        this.stunde = stunde;
    }

    public void tick() {
        long gesamtSekunden = gesamtsekunden();
        gesamtSekunden++;
        zeitUmwandlung(gesamtSekunden);

        /*
         * Andere Variante
         */
//		sekunde++;
//
//		if (sekunde>59) {
//			minute++;
//			sekunde = 0;
//		}
//
//		if (minute>59) {
//			stunde++;
//			minute = 0;
//		}
    }

    public long getStunde() {
        return stunde;
    }

    public long getMinute() {
        return minute;
    }

    public long getSekunde() {
        return sekunde;
    }

    public void setSekunde(long sekunde) {
        if (sekunde < 0 || sekunde > 60) return;
        this.sekunde = sekunde;
    }

    public void setStunde(long stunde) {
        if (stunde < 0 || stunde > 23) return;
        this.stunde = stunde;
    }

    public void setMinute(long minute) {
        if (minute < 0 || minute > 60) return;
        this.minute = minute;
    }

    public void addSekunden(long sekunden) {
        long gesamtSekunden = gesamtsekunden();
        gesamtSekunden += sekunden;
        zeitUmwandlung(gesamtSekunden);
    }

    private long gesamtsekunden() {
        return stunde*3600 + minute*60 + sekunde;
    }

    private void zeitUmwandlung(long gesamtSekunden) {
        sekunde = gesamtSekunden % 60;
        stunde = gesamtSekunden/3600;
        minute = (gesamtSekunden % 3600) / 60;
    }

    public String toString() {
        return getStunde() + ":" + getMinute() + ":" + getSekunde();
    }
    

}
