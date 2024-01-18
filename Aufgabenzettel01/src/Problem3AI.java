import java.util.Scanner;

class Problem3AI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach drei Zahlen fragen
        System.out.print("Geben Sie die erste Zahl ein: ");
        double zahl1 = scanner.nextDouble();

        System.out.print("Geben Sie die zweite Zahl ein: ");
        double zahl2 = scanner.nextDouble();

        System.out.print("Geben Sie die dritte Zahl ein: ");
        double zahl3 = scanner.nextDouble();

        // Methodenaufruf und Ergebnisse ausgeben
        zeigeErgebnisse(zahl1, zahl2, zahl3);

        // Scanner schließen
        scanner.close();
    }

    // Methode zur Berechnung von Summe, Mittelwert und Produkt
    public static void zeigeErgebnisse(double zahl1, double zahl2, double zahl3) {
        // Summe berechnen
        double summe = zahl1 + zahl2 + zahl3;

        // Mittelwert berechnen
        double mittelwert = summe / 3;

        // Produkt berechnen
        double produkt = zahl1 * zahl2 * zahl3;

        // Ergebnisse ausgeben
        System.out.println("Summe: " + summe);
        System.out.println("Mittelwert: " + mittelwert);
        System.out.println("Produkt: " + produkt);
    }
}
