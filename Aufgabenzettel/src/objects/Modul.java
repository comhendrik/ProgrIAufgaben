package objects;
import java.util.ArrayList;

/*
 * Objektinteraktion - Klasse Modul - Klasse Student (n:n Beziehung)
 * - "Ein Modul kennt seine Studenten und umgekehrt"
 * - Ein Modul kann von mehreren Studenten besucht werden
 * - Ein Student kann mehrere Module besuchen
 */
public class Modul {

    private String titel;
    private String dozent;
    private final int creditPoints;
    private final int maxAnzahl;
    private ArrayList<Student> studenten = new ArrayList<>();

    public Modul(String titel, String dozent, int creditPoints, int maxAnzahl) {
//		super();
        this.titel = titel;
        this.dozent = dozent;
        this.creditPoints = creditPoints;
        this.maxAnzahl = maxAnzahl;
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

    public int getMaxAnzahl() {
        return maxAnzahl;
    }

    public ArrayList<Student> getStudentenNichtTun(){
        return studenten;
    }

    public ArrayList<Student> getStudenten(){
        // Kopie der Liste erzeugen
        ArrayList<Student> studentenKopie = new ArrayList<>();
        studentenKopie.addAll(studenten);

        return studentenKopie;
    }

    public void setStudenten(ArrayList<Student> studenten) {
        this.studenten = studenten;
    }

    public boolean addTeilnehmer(Student teilnehmer) {
        //if(studenten.size() < maxAnzahl && !istTeilnehmer(teilnehmer)) {
        //oder auch mittels ArrayList.contains(...)
        if(studenten.size() < maxAnzahl && !studenten.contains(teilnehmer)) {
            studenten.add(teilnehmer);
            return true;
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

    public boolean removeTeilnehmer(Student teilnehmer) {
        return studenten.remove(teilnehmer);
    }

    public int getAnzahl() {
        return studenten.size();
    }

    public void druckeListe() {

        System.out.println("Titel: " + titel);
        System.out.println("Dozent: " + dozent);
        System.out.println("Teilnehmeranzahl: " + getAnzahl());
        System.out.println("Teilnehmer:");
        for(Student student : studenten) {
            //System.out.println(student.getName());
            System.out.println(student);
//			System.out.println("");
        }

    }

    // toString()-Methode ist geeigneter als Alternative zur eigenen Methode druckeListe()
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + creditPoints;
        result = prime * result + maxAnzahl;
        result = prime * result + ((titel == null) ? 0 : titel.hashCode());
        result = prime * result + ((dozent == null) ? 0 : dozent.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Modul other = (Modul) obj;

        if (titel == null) {
            if (other.titel != null)
                return false;
        } else if (!titel.equals(other.titel))
            return false;

        if (dozent == null) {
            if (other.dozent != null)
                return false;
        } else if (!dozent.equals(other.dozent))
            return false;

        if (creditPoints != other.creditPoints)
            return false;

        if (maxAnzahl != other.maxAnzahl)
            return false;

        return true;

    }

    public Student removeTeilnehmer(long matrikelnummer) {
        for (int i=0; i<this.studenten.size(); i++) {
            if (this.studenten.get(i).getMatrikelnummer() == matrikelnummer) return this.studenten.remove(i);
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
