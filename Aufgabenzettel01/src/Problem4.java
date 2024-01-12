import Prog1Tools.IOTools;

class Problem4 {
    public static void main(String[] args) {
        System.out.println("Aufgabe 4");
        int product = IOTools.readInt("1. Zahl eingeben:");
        product *= IOTools.readInt("2. Zahl eingeben:");
        product *= IOTools.readInt("3. Zahl eingeben:");

        System.out.println("Produkt: " + product);
    }
}
