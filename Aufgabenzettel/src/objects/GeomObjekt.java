package objects;

import java.util.Objects;

public abstract class GeomObjekt {
    private int farbe;

    private Koordinate koord;

    public final static int SCHWARZ = 1;

    public final static int WEISS = 0;

    public GeomObjekt(int farbe, double x, double y) {
        setFarbe(farbe);
        koord = new Koordinate(x,y);

    }

    public GeomObjekt(int farbe) {
        this(farbe, 0,0);
    }

    public int getFarbe() {
        return farbe;
    }

    public void setFarbe(int farbe) {
        if (farbe == WEISS || farbe == SCHWARZ) {
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
        return Math.sqrt(Math.pow(koord.getKoordX(), 2) + Math.pow(koord.getKoordY(),2));
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

        GeomObjekt gemObjekt = (GeomObjekt) o;

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
