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

    @Override
    public String toString() {
        return "GemObjekt{" +
                "farbe=" + farbe +
                ", koordX=" + koordX +
                ", koordY=" + koordY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GemObjekt gemObjekt = (GemObjekt) o;

        if (farbe != gemObjekt.farbe) return false;
        if (Double.compare(koordX, gemObjekt.koordX) != 0) return false;
        return Double.compare(koordY, gemObjekt.koordY) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = farbe;
        temp = Double.doubleToLongBits(koordX);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(koordY);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
