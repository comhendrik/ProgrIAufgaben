package wiederholung;

public class Kreis extends GeomObjekt{
    private double radius;

    public Kreis(int farbe, double koordX, double koordY, double radius) {
        super(farbe, koordX, koordY);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius darf nicht kleiner 0 sein");
        this.radius = radius;
    }

    @Override
    public double getFlaeche() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getUmfang() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Kreis{" +
                "radius=" + radius +
                super.toString() +
                '}';
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
