import Prog1Tools.IOTools;

class Problem4 {
    public static void main(String[] args) {
        System.out.println("Problem 4");
        int product = IOTools.readInt("No.1 :");
        product *= IOTools.readInt("No. 2:");
        product *= IOTools.readInt("No. 3:");

        System.out.println("Product: " + product);
    }
}
