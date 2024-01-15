import Prog1Tools.IOTools;

class Problem4 {
    public static void main(String[] args) {
        while (true) {
            int n = IOTools.readInt("n: ");
            if (n <= 1) {
                break;
            }
            boolean isPrimeNumber = true;
            for (int i = 2; i<n; i++) {
                if (n % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) System.out.println("Prime Number!");
            else System.out.println("Not a Prime Number");
        }
    }
}
