package objects;

public class TestObjects {
    public static void main(String[] args) {
        GemObjekt[] objekte = new GemObjekt[5];
        objekte[0] = new Rechteck(1, 10, 10, 10 ,10);
        objekte[1] = new Rechteck(1, 10, 10, 10 ,10);
        objekte[2] = new Rechteck(1, 10, 10, 10 ,10);
        objekte[3] = new Kreis(1, 10, 10, 10 );
        objekte[4] = new Kreis(1, 10, 10, 10 );
        double sum = 0;
        for(GemObjekt obj : objekte) {
            sum += obj.getFläche();
        }
        System.out.println(sum);
    }
}
