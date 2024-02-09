package testObjects;

import objects.Uhr;

public class TestUhr {

    public static void main(String[] args) {

        // Uhr initialisieren
        Uhr uhr = new Uhr();
        Uhr uhr2 = new Uhr();

        // Uhr "starten"
        for(int i = 0; i < 10000; i++) {
            uhr.tick();
        }

        for(int i = 0; i < 10000; i++) {
            uhr2.tick();
        }

        System.out.println(uhr.compare(uhr2));

    }

}
