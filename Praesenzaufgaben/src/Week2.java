import Prog1Tools.IOTools;

class Week2 {
    public static void main(String[] args) {
        sumFor();
    }

    public static void sumFor() {
        int n = IOTools.readInt("How many numbers would you like to sum up?: ");
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += IOTools.readInt("Number " + (i+1) + ": ");
        }
        System.out.println(sum);
    }
}
