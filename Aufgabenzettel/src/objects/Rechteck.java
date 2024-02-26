package objects;

public class Rechteck extends GemObjekt{

    private double a;
    private double b;

    public Rechteck(int farbe, double x, double y, double a, double b) {
        super(farbe, x, y);
        this.a = a;
        this.b = b;

    }

    public Rechteck(int farbe) {
        this(farbe, 0,0,1,1);
    }
}
