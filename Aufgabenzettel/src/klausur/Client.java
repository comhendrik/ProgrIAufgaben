package klausur;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        Zeiteintrag e1 = new Zeiteintrag(8640000, 1);
        e1.setAbrechenbar(true);
        e1.setEnd(8640543);
        System.out.println(e1.getDauer());
        Taetigkeit t1 = new Taetigkeit("Stefan", 12);
        t1.addZeiteintrag(e1);
        ArrayList<Taetigkeit> tList = new ArrayList<>();
        tList.add(t1);
        System.out.println(e1.getDauer() * 12);
        System.out.println(Taetigkeit.aufwandImMonat(tList, "Stefan", 2000, 5));
    }


}
