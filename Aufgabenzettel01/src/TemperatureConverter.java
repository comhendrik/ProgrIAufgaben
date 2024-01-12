import Prog1Tools.IOTools;

class TemperatureConverter {

    public static void main(String[] args) {
        int temperatureInCelsius = IOTools.readInt("Temperaturwert in Celsius eingeben: ");
        System.out.println(temperatureInCelsius * 1.8 + 32);
    }
}
