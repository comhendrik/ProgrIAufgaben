import Prog1Tools.IOTools;

class Problem1While {
    public static void main(String[] args) {
        int n = IOTools.readInt("Zahl n eingeben: ");
        int i = 3;
        while(i<2*n) {
            System.out.println(1.0 / (2*i+1));
            i++;
        }

    }
}
