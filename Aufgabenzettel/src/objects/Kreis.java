package objects;

public class Kreis extends GemObjekt {
    private double radius;

    public Kreis(int farbe, double x, double y, double radius) {
        super(farbe, x, y);
        this.radius = radius;

    }

    public Kreis(int farbe) {
        this(farbe, 0,0, 0);
    }
}
