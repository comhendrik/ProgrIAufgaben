package objects;

import java.awt.*;
import java.util.Objects;

public abstract class GemObjekt {
    protected int farbe;

    protected Koordinate koord;

    final static int SCHWARZ = 1;

    final static int WEISS = 1;

    public GemObjekt(int farbe, double x, double y) {
        setFarbe(farbe);
        koord = new Koordinate(x,y);

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

    public Koordinate getKoord() {
        return koord;
    }

    public void setKoord(Koordinate koord) {
        this.koord = koord;
    }

    public double getAbstandUrsprung() {
        return Math.sqrt(Math.pow(koord.getKoordX(), 2)+Math.pow(koord.getKoordY(),2));
    }

    @Override
    public String toString() {
        return "GemObjekt{" +
                "farbe=" + farbe +
                ", koord=" + koord +
                '}';
    }

    public abstract double getFläche();

    public abstract double getUmfang();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GemObjekt gemObjekt = (GemObjekt) o;

        if (farbe != gemObjekt.farbe) return false;
        return Objects.equals(koord, gemObjekt.koord);
    }

    @Override
    public int hashCode() {
        int result = farbe;
        result = 31 * result + (koord != null ? koord.hashCode() : 0);
        return result;
    }
}
