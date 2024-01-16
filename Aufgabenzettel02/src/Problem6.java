class Problem6 {

    public static void main(String[] args) {
        int range1, range2, range3, range4, range5, range6, range7, range8, range9, range10;
        range1 = range2 = range3 = range4 = range5 = range6 = range7 = range8 = range9 = range10 = 0;
        //range1 = [0,1.0/10)
        //range2 = [1.0/10,2.0/10)
        //range3 = [2.0/10,3.0/10)
        //range4 = [3.0/10,4.0/10)
        //range5 = [4.0/10,5.0/10)
        //range6 = [5.0/10,6.0/10)
        //range7 = [6.0/10,7.0/10)
        //range8 = [7.0/10,8.0/10)
        //range9 = [8.0/10,9.0/10)
        //range10 = [9.0/10,1.0)
        for (int i=0; i<1000; i++) {
            double n = Math.random();
            if (n < 1.0/10) {
                range1++;
            } else if (n < 2.0/10) {
                range2++;
            } else if (n < 3.0/10) {
                range3++;
            } else if (n < 4.0/10) {
                range4++;
            } else if (n < 5.0/10) {
                range5++;
            } else if (n < 6.0/10) {
                range6++;
            } else if (n < 7.0/10) {
                range7++;
            } else if (n < 8.0/10) {
                range8++;
            } else if (n < 9.0/10) {
                range9++;
            } else {
                range10++;
            }
        }
        System.out.println("[0,1.0/10): " + range1);
        System.out.println("[1.0/10,2.0/10): " + range2);
        System.out.println("[2.0/10,3.0/10): " + range3);
        System.out.println("[3.0/10,4.0/10): " + range4);
        System.out.println("[4.0/10,5.0/10): " + range5);
        System.out.println("[5.0/10,6.0/10): " + range6);
        System.out.println("[6.0/10,7.0/10): " + range7);
        System.out.println("[7.0/10,8.0/10): " + range8);
        System.out.println("[8.0/10,9.0/10): " + range9);
        System.out.println("[9.0/10,1.0): " + range10);

    }
}
