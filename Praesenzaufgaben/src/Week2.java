import Prog1Tools.IOTools;

class Week2 {

    public static void main(String[] args) {
        checksum();
    }

    public static void sumFor() {
        int n = IOTools.readInt("How many numbers would you like to sum up?: ");
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += IOTools.readInt("Number " + (i+1) + ": ");
        }
        System.out.println("Sum = " + sum);
    }

    public static void sumWhile() {
        int n = IOTools.readInt("How many numbers would you like to sum up?: ");
        int sum = 0;
        int count = 0;
        while(count<n) {
            sum += IOTools.readInt("Number " + (count+1) + ": ");
            count++;
        }
        System.out.println("Sum = " + sum);
    }

    public static void sumDoWhile() {
        int n = IOTools.readInt("How many numbers would you like to sum up?: ");
        int sum = 0;
        int count = 0;
        if (count < n) {
            do {
                sum += IOTools.readInt("Number " + (count+1) + ": ");
                count++;
            } while(count<n);
        }
        System.out.println("Sum = " + sum);
    }

    public static void sumWhileNot0() {
        int n = 1;
        int sum = 0;
        n = IOTools.readInt("No.: ");
        while (n != 0) {
            sum += n;
            n = IOTools.readInt("No.: ");
        }
        System.out.println("Sum = "+ sum);
    }

    public static void checksum() {
        long l = IOTools.readLong("Name a number to calculate the checksum: ");
        int checksum = 0;
        while (l>0) {
            checksum += l % 10;
            l /= 10;
        }
        System.out.println(checksum);
    }
}
