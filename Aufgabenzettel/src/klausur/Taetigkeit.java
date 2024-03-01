package klausur;

import java.util.ArrayList;
import java.util.Collections;

public class Taetigkeit {
    private String kunde;

    private double stundensatz;

    private ArrayList<Zeiteintrag> zeiteintraege;

    public Taetigkeit(String kunde, double stundensatz) {
        this.kunde = kunde;
        this.stundensatz = stundensatz;
        this.zeiteintraege = new ArrayList<>();
    }

    public boolean addZeiteintrag(Zeiteintrag eintrag) {
        for (Zeiteintrag elm : zeiteintraege) {
            if (elm.equals(eintrag)) return false;
            if (elm.getEnd() == -1 && eintrag.getEnd() == -1) return false;
            if (elm.getEnd() == -1 && elm.getBegin() < eintrag.getBegin()) return false; //brauch man den?
            if (elm.ueberdeckt(eintrag)) return false;
        }
        zeiteintraege.add(eintrag);
        Collections.sort(zeiteintraege);
        return true;
    }

    public static double aufwandImMonat(ArrayList<Taetigkeit> tätigkeiten, String kunde, int jahr, int monat) {
        double aufwand = 0;
        for (Taetigkeit elm : tätigkeiten) {
            if (!elm.kunde.equals(kunde)) continue;
            for (Zeiteintrag eintrag : elm.zeiteintraege) {
                if (!eintrag.isAbrechenbar()) continue;
                if (eintrag.istInMonat(jahr, monat)) aufwand += elm.stundensatz * eintrag.getDauer();
            }
        }
        return aufwand;
    }
}
