import Prog1Tools.IOTools;

class Problem3 {
    public static void main(String[] args) {
        final int a = IOTools.readInt("No. 1: ");
        final int b = IOTools.readInt("No.2: ");
        int euclidA = a;
        int euclidB = b;
        int division_rest;
        System.out.println("a)");
        while (euclidB != 0) {
            division_rest = euclidA % euclidB;
            euclidA = euclidB;
            euclidB = division_rest;
        }
        System.out.println(euclidA);
        System.out.println("b)");
        int min = a < b ? a : b;
        int ggt = -1;
        for (int i = 1; i < min + 1; i++) {
            if (a % i == 0 && b % i == 0) {
                ggt = i;
            }
        }
        System.out.println(ggt);
    }
}
