package klausur_2;

public class Client {
    public static void main(String[] args) {
        Zeiteintrag z = new Zeiteintrag(1, 0);
        z.setEnde(5400);
        System.out.println(z.getDauer());
        System.out.println(z.toString());

    }
}
