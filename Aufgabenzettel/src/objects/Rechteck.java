package objects;

public class Rechteck extends GemObjekt{

    private double a;
    private double b;

    public Rechteck(int farbe, double x, double y, double a, double b) {
        super(farbe, x, y);
        setA(a);
        setB(b);

    }

    public Rechteck(int farbe) {
        this(farbe, 0,0,1,1);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a < 0) throw new RuntimeException("Wert kleiner 0 für a");
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b < 0) throw new RuntimeException("Wert kleiner 0 für b");
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "a=" + a +
                ", b=" + b +
                "} " + super.toString();
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
