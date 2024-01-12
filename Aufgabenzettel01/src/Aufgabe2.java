class Aufgabe2 {
    public static void main(String[] args) {
        System.out.println("Aufgabe 2");
        int i,l,m,n;
        l = 8/3;
        i = l * 6 * l + 1; // i =25
        l = m = n = l * 4; // l = m = n = 8
        n = n*m; // n = 64
        m = n/l; // m = 8
        l = i * m +n; // l = 264
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
