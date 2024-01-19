import Prog1Tools.IOTools;

public class Problems02 {

    public static void main(String[] args) {
        //problem1DoWhile();
        //problem1For();
        //problem1While();
        //problem2();
        //problem3();
        //problem4();
        //problem5();
        problem5Help();
        //problem6();


    }

    public static void problem1DoWhile() {
        int n = IOTools.readInt("Zahl n eingeben: ");
        int i = 3;
        do {
            System.out.println(1.0 / (2*i+1));
            i++;
        } while(i<2*n);

    }

    public static void problem1For() {
        int n = IOTools.readInt("Zahl n eingeben: ");
        for (int i=3; i<2*n; i++) {
            System.out.println(1.0 / (2*i+1));
        }

    }

    public static void problem1While() {
        int n = IOTools.readInt("Zahl n eingeben: ");
        int i = 3;
        while(i<2*n) {
            System.out.println(1.0 / (2*i+1));
            i++;
        }

    }

    public static void problem2() {
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

    public static void problem3() {
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

    public static void problem4() {
        while (true) {
            int n = IOTools.readInt("n: ");
            if (n <= 1) {
                break;
            }
            boolean isPrimeNumber = true;
            for (int i = 2; i<n; i++) {
                if (n % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) System.out.println("Prime Number!");
            else System.out.println("Not a Prime Number");
        }
    }

    public static void problem5() {
        System.out.println("Time to find a perfect number");
        int possiblePerfectNumber = 1;
        int perfectNumberCounter = 0;
        while (true) {
            int sum = 0;
            for (int i = 1; i < possiblePerfectNumber; i++) {
                if (possiblePerfectNumber % i == 0) {
                    sum += i;
                }
            }
            if (sum == possiblePerfectNumber) {
                System.out.println(possiblePerfectNumber);
                perfectNumberCounter++;
                if (perfectNumberCounter == 5) break;
            }
            possiblePerfectNumber++;

        }
    }

    public static void problem5Help() {
        int currentNumber = 2;
        int numberCounter = 0;
        while (true) {
            int sum = 0;
            //Man muss nur bis zur Wurzel gehen, da jede Zahl größer als die Wurzel niemals ein Teiler sein kann:
            // Bsp: sqrt(25) = 5 -> 25 % 6 != 0,
            int sqrt = (int) Math.sqrt(currentNumber);
            for (int i = 1; i <= sqrt; i++) {
                if (currentNumber % i == 0) {
                    sum += i;

                    if (i != currentNumber / i) {
                        sum += currentNumber / i;
                    }
                }
            }
            if (sum == currentNumber * 2) {
                System.out.println(currentNumber);
                numberCounter++;
                if (numberCounter == 5) break;
            }
            currentNumber++;

        }
    }

    public static void problem6() {
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
