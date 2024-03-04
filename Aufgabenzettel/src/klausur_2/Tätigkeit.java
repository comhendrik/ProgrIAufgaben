package klausur_2;

import java.util.ArrayList;
import java.util.Collections;

public class Tätigkeit {
    private String kunde;
    private double stundensatz;

    private ArrayList<Zeiteintrag> einträge;

    public Tätigkeit(String kunde, double stundensatz) {
        if (stundensatz < 0) throw new RuntimeException("Stundensatz ist kleiner null und muss größer null sein");
        this.kunde = kunde;
        this.stundensatz = stundensatz;
        this.einträge = new ArrayList<>();
    }

    public boolean addZeiteintrag(Zeiteintrag eintrag) {
        if (einträge.contains(eintrag)) return false;
        for (Zeiteintrag elm : einträge) {
            if (eintrag.überdeckt(elm)) return false;
            if (!eintrag.eintragKannHinzugefügtWerden(elm)) return false;
        }
        einträge.add(eintrag);
        Collections.sort(einträge);
        return true;
    }
}
