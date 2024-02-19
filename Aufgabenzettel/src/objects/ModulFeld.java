package objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/*
 * Objektinteraktion - Klasse Modul - Klasse Student (n:n Beziehung)
 * - "Ein Modul kennt seine Studenten und umgekehrt"
 * - Ein Modul kann von mehreren Studenten besucht werden
 * - Ein Student kann mehrere Module besuchen
 */
public class ModulFeld {

    private String titel;
    private String dozent;
    private final int creditPoints;
    private Student[] studenten;

    public ModulFeld(String titel, String dozent, int creditPoints, int maxAnzahl) {
//		super();
        this.titel = titel;
        this.dozent = dozent;
        this.creditPoints = creditPoints;
        studenten = new Student[maxAnzahl];
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDozent() {
        return dozent;
    }

    public void setDozent(String dozent) {
        this.dozent = dozent;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public Student[] getStudentenNichtTun(){
        return studenten;
    }

    public ArrayList<Student> getStudenten(){
        // Kopie der Liste erzeugen
        ArrayList<Student> studentenKopie = new ArrayList<>();
        for (Student elm: studenten) studentenKopie.add(elm);
        return studentenKopie;
    }

    public void setStudenten(Student[] studenten) {
        if (studenten.length == this.studenten.length) this.studenten = studenten;
        else throw new RuntimeException("Feld hat nicht die richtige Anzahl an Elementen");
    }

    public boolean addTeilnehmer(Student teilnehmer) {
        if (!istTeilnehmer(teilnehmer)) return false;
        for(int i=0; i<studenten.length; i++) {
            if (studenten[i] == null) {
                studenten[i] = teilnehmer;
                return true;
            }
        }
        return false;
    }

    public boolean istTeilnehmer(Student teilnehmer) {
        for (Student s : studenten) {
            if (teilnehmer.equals(s))
                return true;
        }
        return false;
    }

    public int getAnzahl() {
        return studenten.length;
    }


    @Override
    public String toString() {
        String objektBeschreibung =
                "Titel: " + titel +
                        " Dozent: " + dozent +
                        " Teilnehmeranzahl: " + getAnzahl() +
                        "\nTeilnehmer: \n";

        for (Student s : studenten) {
            objektBeschreibung += s.toString();
            objektBeschreibung += "\n";
        }
        return objektBeschreibung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModulFeld modulFeld = (ModulFeld) o;
        return creditPoints == modulFeld.creditPoints && Objects.equals(titel, modulFeld.titel) && Objects.equals(dozent, modulFeld.dozent) && Arrays.equals(studenten, modulFeld.studenten);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(titel, dozent, creditPoints);
        result = 31 * result + Arrays.hashCode(studenten);
        return result;
    }

    public Student removeTeilnehmer(long matrikelnummer) {
        for (int i=0; i<studenten.length; i++) {
            if (studenten[i].getMatrikelnummer() == matrikelnummer) {
                Student removeStudent = studenten[i];
                studenten[i] = null;
                return removeStudent;
            }
        }
        return new Student(0);
    }

    public ArrayList<Student> bewerten(ArrayList<Long> matrikelnummern) {
        ArrayList<Student> bewerteteStudenten = new ArrayList<>();

        for (Student stud : this.studenten) {
            if (matrikelnummern.contains(stud.getMatrikelnummer())) {
                stud.erhoeheCreditPoints(this.creditPoints);
                bewerteteStudenten.add(stud);
            }
        }

        return bewerteteStudenten;
    }


}
