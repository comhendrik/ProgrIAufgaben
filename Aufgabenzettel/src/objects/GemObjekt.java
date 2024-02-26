package objects;

import java.awt.*;

public abstract class GemObjekt {
    protected int farbe;

    protected double koordX;

    protected double koordY;

    final static int SCHWARZ = 1;

    final static int WEISS = 1;

    public GemObjekt(int farbe, double x, double y) {
        setFarbe(farbe);
        koordY = y;
        koordX = x;

    }

    public GemObjekt(int farbe) {
        this(farbe, 0,0);
    }

    public int getFarbe() {
        return farbe;
    }

    public void setFarbe(int farbe) {
        if (farbe == 1 || farbe == 0) {
            this.farbe = farbe;
        } else {
            throw new RuntimeException("Farbe darf nur 0 oder 1 betragen");
        }
    }

    public double getKoordX() {
        return koordX;
    }

    public void setKoordX(double koordX) {
        this.koordX = koordX;
    }

    public double getKoordY() {
        return koordY;
    }

    public void setKoordY(double koordY) {
        this.koordY = koordY;
    }

    public double getAbstandUrsprung() {
        return Math.sqrt(Math.pow(koordX, 2)+Math.pow(koordY,2));
    }
}
