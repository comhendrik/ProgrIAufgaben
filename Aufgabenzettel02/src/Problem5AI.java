public class Problem5AI {

    public static void main(String[] args) {
        int currentNumber = 2;
        int numberCounter = 0;
        while (true) {

            int sum = 1;
            //Verbesserung der Teilerfindung mit AI
            int sqrt = (int) Math.sqrt(currentNumber);
            for (int i = 2; i <= sqrt; i++) {
                if (currentNumber % i == 0) {
                    sum += i;
                    //Man geht nur bis zur Wurzel, da man mit folgendem Code, die Teiler korrospondieren zu den anderen Teilern ebenfalls betrachten kann
                    if (i != currentNumber / i) {
                        sum += currentNumber / i;
                    }
                }
            }
            //Ende Verbesserung
            if (sum == currentNumber) {
                System.out.println(currentNumber);
                numberCounter++;
                if (numberCounter == 5) break;
            }
            currentNumber++;

        }
    }
}
