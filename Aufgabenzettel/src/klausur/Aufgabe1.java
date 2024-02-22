package klausur;

public class Aufgabe1 {

    public static void main(String[] args) {
        System.out.println(quersumme(1234));

    }

    public static int quersumme(long zahl) {
        long sum = 0;
        while (zahl > 10) {
            sum += zahl % 10;
            zahl = zahl / 10;
        }
        sum += zahl;
        return (int) sum;
    }
}
