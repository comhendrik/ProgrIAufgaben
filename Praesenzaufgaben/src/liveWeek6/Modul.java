package liveWeek6;

import java.util.ArrayList;

public class Modul {

    private String name;

    private String dozierender;

    private int maxTN = 40;

    private ArrayList<Student> studenten;


    public Modul(String name, String dozierender) {
        this.name = name;
        this.dozierender = dozierender;
        this.studenten = new ArrayList<>();
    }

    //Ggf. weitere Konstrukturen und Konstruktorenverkettung


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDozierender() {
        return dozierender;
    }

    public void setDozierender(String dozierender) {
        this.dozierender = dozierender;
    }

    public int getMaxTN() {
        return maxTN;
    }

    public void setMaxTN(int maxTN) {
        this.maxTN = maxTN;
    }

    public ArrayList<Student> getStudenten() {
        return studenten;
    }

    public void setStudenten(ArrayList<Student> studenten) {
        this.studenten = studenten;
    }

    public void addTeilnehmer(Student tn) {
        //studenten.contains braucht eine richtige equals implementierung
        if (studenten.size() < maxTN && istTeilnehmer(tn)) {
            studenten.add(tn);
        }

    }

    private boolean istTeilnehmer(Student tn) {
        return studenten.contains(tn);
    }
}
