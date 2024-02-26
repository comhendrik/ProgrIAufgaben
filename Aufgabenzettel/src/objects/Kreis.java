package objects;

public class Kreis extends GemObjekt {
    private double radius;

    public Kreis(int farbe, double x, double y, double radius) {
        super(farbe, x, y);
        setRadius(radius);

    }

    public Kreis(int farbe) {
        this(farbe, 0,0, 0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) throw new RuntimeException("radius kleiner 0");
        this.radius = radius;
    }

    public double getFläche() {
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
