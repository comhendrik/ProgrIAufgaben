package objects;

class Koordinate {
    private double koordX;
    private double koordY;

    public Koordinate(double koordX, double koordY) {
        this.koordX = koordX;
        this.koordY = koordY;
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

    @Override
    public String toString() {
        return "Koordinate{" +
                "koordX=" + koordX +
                ", koordY=" + koordY +
                '}';
    }
}
