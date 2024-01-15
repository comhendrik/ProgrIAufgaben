import Prog1Tools.IOTools;

class Problem1DoWhile {
    public static void main(String[] args) {
        int n = IOTools.readInt("Zahl n eingeben: ");
        int i = 3;
        do {
            System.out.println(1.0 / (2*i+1));
            i++;
        } while(i<2*n);

    }
}
