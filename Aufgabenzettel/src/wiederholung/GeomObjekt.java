package wiederholung;

public abstract class GeomObjekt {
    private int farbe;
    private double koordX;

    private double koordY;

    public final static int SCHWARZ = 1;

    public final static int WEISS = 0;

    public GeomObjekt(int farbe, double koordX, double koordY) {
        setFarbe(farbe);
        this.koordX = koordX;
        this.koordY = koordY;
    }

    public GeomObjekt(int farbe) {
        this(farbe, 0,0);
    }

    public int getFarbe() {
        return farbe;
    }

    public void setFarbe(int farbe) {
        if (farbe == WEISS || farbe == SCHWARZ) this.farbe = farbe;
        else throw new IllegalArgumentException("Der Wert der Farbe muss O für weiß oder 1 für schwarz sein");
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

    public abstract double getUmfang();

    public abstract double getFlaeche();

    @Override
    public String toString() {
        return "GeomObjekt{" +
                "farbe=" + farbe +
                ", koordX=" + koordX +
                ", koordY=" + koordY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeomObjekt that = (GeomObjekt) o;

        if (farbe != that.farbe) return false;
        if (Double.compare(koordX, that.koordX) != 0) return false;
        return Double.compare(koordY, that.koordY) == 0;
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
