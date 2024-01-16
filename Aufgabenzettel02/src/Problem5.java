import Prog1Tools.IOTools;

class Problem5 {
    //perfect numbers => 6, 28, 496, 8.128, 33.550.336, 8.589.869.056.
    public static void main(String[] args) {
        System.out.println("Time to find a perfect number");
        int possiblePerfectNumber = 1;
        int perfectNumberCounter = 0;
        while (true) {
            int sum = 0;
            for (int i = 1; i < possiblePerfectNumber; i++) {
                if (possiblePerfectNumber % i == 0) {
                    sum += i;
                }
            }
            if (sum == possiblePerfectNumber) {
                System.out.println(possiblePerfectNumber);
                perfectNumberCounter++;
                if (perfectNumberCounter == 5) break;
            }
            possiblePerfectNumber++;

        }
    }
}
