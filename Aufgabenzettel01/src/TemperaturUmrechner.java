class TemperaturUmrechner {

    public void rechneGradInCelsiusUm(int gradInCelsius) {
        double fahrenheitwert = gradInCelsius * 1.8 + 32;
        //gradInCelsius * 1.8 + 32 könnte auch in das print-Statement direkt eingetragen werden
        System.out.println(fahrenheitwert);
    }
}
