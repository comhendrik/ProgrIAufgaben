package klausur;

import java.util.ArrayList;

public class Aufgabe2 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        list.add(5.0);
        list.add(1.4);
        list.add(3.0);
        System.out.println(extrahiereIntervall(3.0, 4.9, list));
    }

    public static ArrayList<Double> extrahiereIntervall(double untereGrenze, double obereGrenze, ArrayList<Double> werte) {
        ArrayList<Double> extrahierteWerte = new ArrayList<>();
        for(double elm : werte) {
            if (untereGrenze <= elm && elm <= obereGrenze) {
                extrahierteWerte.add(elm);
            }
        }
        return  extrahierteWerte;
    }
}
