import Prog1Tools.IOTools;

class Problem1For {

    public static void main(String[] args) {
        int n = IOTools.readInt("Zahl n eingeben: ");
        for (int i=3; i<2*n; i++) {
            System.out.println(1.0 / (2*i+1));
        }

    }
}
