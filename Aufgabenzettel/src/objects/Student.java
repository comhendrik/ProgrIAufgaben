package objects;

public class Student {

    private long matrikelnummer;
    private String name;
    private int creditPoints;

    private static int anzahl;
    public Student(){
        anzahl++;
    }

    public Student(String zeile) {
        String[] felder = zeile.split(";");
        matrikelnummer = Long.parseLong(felder[0]);
        name = felder[1];
        creditPoints = Integer.parseInt(felder[2]);
        anzahl++;
    }

    public Student(long nr, String name, int creditPoints) {
        this(nr, name); // Konstruktorenverkettung
        this.creditPoints = creditPoints;
    }

    public Student(long nr, String name) {
        this(nr); // Konstruktorenverkettung
        this.name = name;
    }

    public Student(long nr) {
        matrikelnummer = nr;
        anzahl++;
    }
    /*
     * Getter und Setter
     */
    public static int getAnzahl() {
        return anzahl;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMatrikelnummer() {
        return matrikelnummer;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    /*
     * Objektmethoden
     */

    // Methode zur Zustandsaenderung
    public void erhoeheCreditPoints(int n) {
        if (n > 0) {
            creditPoints += n;
        }
    }

    public void drucke() {
        System.out.println("Name: " + name);
        System.out.println("Matrikelnummer: " + matrikelnummer);
        System.out.println("Credit-Points: " + creditPoints);
    }

    @Override
    public String toString() {
        return "Student [matrikelnummer=" + matrikelnummer + ", "
                + "name=" + name + ", creditPoints=" + creditPoints + "]";
    }

}
