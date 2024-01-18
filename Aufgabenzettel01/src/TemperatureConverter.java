import Prog1Tools.IOTools;

class TemperatureConverter {

    public static void main(String[] args) {
        double temperatureInCelsius = IOTools.readDouble("Temperaturwert in Celsius eingeben: ");
        System.out.println(temperatureInCelsius * 1.8 + 32);
    }
}
