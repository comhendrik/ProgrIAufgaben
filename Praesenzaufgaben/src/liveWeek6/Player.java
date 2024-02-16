package liveWeek6;

public class Player {


    //Objektmethoden lassen sich nur mit einer Referenz aufrufen, nicht aber mit der Klasse allgemein.
    //Dafür wird eine Klassenmethode verwendet


    //Klassenattribute lassen sich über die Klasse, als auch über die Referenz erhalten, aber nach Konvention wird es
    //über den Klassennamen aufgerufen

    private double posX, posY;

    private String name;

    public Player() {
        //default Werte werden initialsiert
        //Referenztypen bekommen null
        //String = null;
        //primitive Datentypen bekommen einen Standartwert
        //boolean = false;
        //int = 0; und so weiter
    }

    public Player(double posX, double posY, String name) {
        setPosX(posX);
        this.posY = posY;
        this.name = name;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        if (posX != 0) {
            this.posX = posX;
        } else throw new RuntimeException("Value is 0");

    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    //toString() ist eine fundamentale Methode für die Klasse, deshalb gehört es zur Objektinfrastruktur
    @Override
    public String toString() {
        return "Player{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean equals(Player other) {
        //wir arbeiten mit this und other als Referenzen
        //Man darf hier ebenfalls auf die Attribute eines anderen Objektes zugreifen, weil man sich ja trotzdem in der Klasse befindet
        return this.posX == other.posX && this.posY == other.posY;
    }
}
