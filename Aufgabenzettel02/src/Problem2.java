import Prog1Tools.IOTools;

class Problem2 {
    public static void main(String[] args) {
        int a = IOTools.readInt("a: ");
        int b = IOTools.readInt("b: ");
        int c = IOTools.readInt("c: ");

        int min = a;
        int max = a;

        if (b < min) min = b;
        if (c < min) min = c;
        if (b > max) max = b;
        if (c > max) max = c;

        if (min < a && a < max) System.out.println(a);
        else if (min < b && b < max) System.out.println(b);
        else if (min < c && c < max) System.out.println(c);
        //Only executed when numbers are not equal
        else if (a==b) System.out.println(a);
        else if (a==c) System.out.println(a);
        else System.out.println(b);
    }
}
