class Problem5 {

    public static void main(String[] args) {
        System.out.println("Aufgabe 5");
        System.out.print("Die Ziffern sind: ");
        int n = 78636;
        int divider = 10000;

        System.out.print(n/divider + ", ");
        n = n % divider;
        divider /= 10;

        System.out.print(n/divider + ", ");
        n = n % divider;
        divider /= 10;

        System.out.print(n/divider + ", ");
        n = n % divider;
        divider /= 10;

        System.out.print(n/divider + ", ");
        n = n % divider;

        System.out.print(n);
    }


    public static void goingFurther() {
        System.out.println("Aufgabe 5");
        System.out.print("Die Ziffern sind: ");
        int n = 78636;
        int divider = 10000;
        while (n>10) {
            System.out.print(n/divider + ", ");
            n = n % divider;
            divider /= 10;
        }
        System.out.print(n);
    }
}
