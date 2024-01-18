import Prog1Tools.IOTools;

class Problem3 {
    public static void main(String[] args) {
        System.out.println("Problem 3");
        double number1 = IOTools.readDouble("No. 1: ");
        double number2 = IOTools.readDouble("No. 2: ");
        double number3 = IOTools.readDouble("No. 3: ");

        double sum = number1 + number2 + number3;
        double mean = (number1 + number2 + number3) / 3.0;
        double product = number1 * number2 * number3;

        System.out.println("Sum: " + (number1 + number2 + number3));
        System.out.println("Mean: " + mean);
        System.out.println("Product: " + product);
    }
}
