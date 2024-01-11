import Prog1Tools.IOTools;

class Main {
    public static void main(String[] args) {
        System.out.println("Aufgabe 1");

        TemperaturUmrechner umrechner = new TemperaturUmrechner();
        int temperaturWertInCelsius = IOTools.readInt("Temperaturwert in Celsius eingeben:");
        umrechner.rechneGradInCelsiusUm(temperaturWertInCelsius);

        Aufgaben aufgaben = new Aufgaben();
        aufgaben.aufgabeZwei();
        aufgaben.aufgabeDrei();
        aufgaben.aufgabeVier();
        aufgaben.aufgabeFuenf();
        System.out.println(aufgaben.aufgabeSechs());
    }
}