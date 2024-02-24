package klausur;

public class Client {

    public static void main(String[] args) {
        Zeiteintrag e1 = new Zeiteintrag(0, 1);
        e1.setEnd(5433);
        System.out.println(e1.getDauer());
    }


}
