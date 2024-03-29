package objects;

public class Kreis extends GeomObjekt {
    private double radius;

    public Kreis(int farbe, double x, double y, double radius) {
        super(farbe, x, y);
        setRadius(radius);

    }

    public Kreis(int radius) {
        this(GeomObjekt.SCHWARZ, 0,0, radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) throw new RuntimeException("radius kleiner 0");
        this.radius = radius;
    }

    @Override
    public double getFläche() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getUmfang() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Kreis{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Kreis kreis = (Kreis) o;

        return Double.compare(radius, kreis.radius) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
