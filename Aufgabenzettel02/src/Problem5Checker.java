import Prog1Tools.IOTools;

public class Problem5Checker {

    public static void main(String[] args) {
        int n = IOTools.readInt("Check if number is a perfect number: ");
        int possiblePerfectNumber = 1;
        int perfectNumberCounter = 0;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) System.out.println("It's a perfect number!");
        else System.out.println("Not a perfect number");
    }
}
