package wiederholung;

public class Rechteck extends GeomObjekt{

    private double a;
    private double b;

    public Rechteck(int farbe, double a, double b, double koordX, double koordY) {
        super(farbe, koordX, koordY);
        setA(a);
        setB(b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a < 0) throw new IllegalArgumentException("a darf nicht kleiner als 0 sein");
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b<0) throw new IllegalArgumentException("b darf nicht kleiner als 0 sein");
        this.b = b;
    }

    @Override
    public double getUmfang() {
        return a * 2 + b * 2;
    }

    @Override
    public double getFlaeche() {
        return a * b;
    }

    public boolean ueberdeckt(Rechteck other) {
        boolean erstesKriterium = other.getKoordX() > (this.getKoordX()+a);
        boolean zweitesKriterium = (other.getKoordY() + b) < this.getKoordY();
        boolean drittesKriterium = other.getKoordY() > (this.getKoordY()+b);
        boolean viertesKriterium = (other.getKoordX() + a) < this.getKoordX();
        return !(erstesKriterium || zweitesKriterium || drittesKriterium || viertesKriterium);
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "a=" + a +
                ", b=" + b +
                super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rechteck rechteck = (Rechteck) o;

        if (Double.compare(a, rechteck.a) != 0) return false;
        return Double.compare(b, rechteck.b) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
