import Prog1Tools.IOTools;

class Problem3 {
    public static void main(String[] args) {
        System.out.println("Aufgabe 3");
        int number1 = IOTools.readInt("1. Zahl eingeben: ");
        int number2 = IOTools.readInt("2. Zahl eingeben: ");
        int number3 = IOTools.readInt("3. Zahl eingeben: ");

        int sum = number1 + number2 + number3;
        double mean = (number1 + number2 + number3) / 3.0;
        int product= number1 * number2 * number3;

        System.out.println("Summe: " + sum);
        System.out.println("Mittelwert: " + mean);
        System.out.println("Produkt: " + product);
    }
}
