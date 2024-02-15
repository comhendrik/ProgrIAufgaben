package objects;

public class Rectangle {

    private double a;
    private double b;
    private double x;
    private double y;

    public Rectangle(double a, double b, double x, double y) throws RuntimeException {
        this(a,b);

        this.y = y; //weil es sparsamer ist

        this.x = x;
    }

    public Rectangle(double a, double b) throws RuntimeException {
        setA(a); //damit man die validierung einheitlich macht

        setB(b);
    }
    public void setA(double a) throws RuntimeException {
        if (a<0) throw new RuntimeException("a<0");
        this.a = a;
    }

    public void setB(double b) throws RuntimeException {
        if (a<0) throw new RuntimeException("b<0");
        this.b = b;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public double getCircumference() {
        return a * 2 + b * 2;
    }

    public double getArea() {
        return a * b;
    }

    public boolean covers(Rectangle rec) {
        double horizontalLineRec = this.x + this.a;
        double verticalLineRec = this.y + this.b;
        //check all 4 corners of rectangle;

        //bottom left: P(rec.x | rec.y)
        if ((this.x <= rec.x && rec.x <= horizontalLineRec) && (this.y <= rec.y && rec.y <= verticalLineRec)) return true;
        //bottom right: P(rec.x + rec.a | rec.y)
        if ((this.x <= rec.x + rec.a && rec.x + rec.a <= horizontalLineRec) && (this.y <= rec.y && rec.y <= verticalLineRec)) return true;
        //top left: P(rec.x | rec.y + rec.b)
        if ((this.x <= rec.x  && rec.x  <= horizontalLineRec) && (this.y <= rec.y + rec.b && rec.y + rec.b <= verticalLineRec)) return true;
        //top right P(rec.x + rec.a | rec.y + rec.b )
        return (this.x <= rec.x + rec.a && rec.x + rec.a <= horizontalLineRec) && (this.y <= rec.y + rec.b && rec.y + rec.b <= verticalLineRec);


    }

    //Klassenmethode:

    public static final int test() {
        return 1;
    }


}
