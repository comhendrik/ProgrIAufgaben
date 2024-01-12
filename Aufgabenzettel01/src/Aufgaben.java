import Prog1Tools.IOTools;

public class Aufgaben {
    public void aufgabeZwei() {

    }
    public void aufgabeDrei() {
        System.out.println("Aufgabe 3");
        int zahl1 = IOTools.readInt("1. Zahl eingeben:");
        int zahl2 = IOTools.readInt("2. Zahl eingeben:");
        int zahl3 = IOTools.readInt("3. Zahl eingeben:");

        int summe = zahl1 + zahl2 + zahl3;
        double mittelwert = (zahl1 + zahl2 + zahl3) / 3.0;
        int produkt = zahl1 * zahl2 * zahl3;

        System.out.println("Summe: " + summe);
        System.out.println("Mittelwert: " + mittelwert);
        System.out.println("Produkt: " + produkt);
    }

    public void aufgabeVier() {
        System.out.println("Aufgabe 4");
        int produkt = IOTools.readInt("1. Zahl eingeben:");
        produkt = produkt * IOTools.readInt("2. Zahl eingeben:");
        produkt = produkt * IOTools.readInt("3. Zahl eingeben:");

        System.out.println("Produkt: " + produkt);
    }

    public void aufgabeFuenf() {
        System.out.println("Aufgabe 5");
        System.out.print("Die Ziffern sind: ");
        int n = 78636;
        int divider = 10000;
        while (n>10) {
            System.out.print(n/divider + ", ");
            n = n % divider;
            divider /= 10;
        }
        System.out.print(n);
    }

    public boolean aufgabeSechs() {
        System.out.println("Aufgabe 6");
        int jahr = IOTools.readInt("Jahr eingeben");
        if (jahr % 4 != 0) return false;
        if (jahr % 100 != 0) return true;
        if (jahr % 400 != 0) return false;
        return true;
    }
}
