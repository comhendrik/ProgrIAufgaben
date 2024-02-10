package objects;

public class Rectangle {

    private double a;
    private double b;
    private double x;
    private double y;

    public Rectangle(double a, double b, double x, double y) {
        if (a < 0) this.a = 0;
        else this.a = a;

        if (b < 0) this.b = 0;
        else this.b = b;

        this.x = x;

        this.y = y;
    }
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setX(double x) {
        if (x < 0) return;
        this.x = x;
    }

    public void setY(double y) {
        if (y<0) return;
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
