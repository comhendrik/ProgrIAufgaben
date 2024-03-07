package wiederholung;

import java.util.Arrays;

public class TestClient {
    public static void main(String[] args) {
        String s = "1234;hans Hansen;6";
        String[] res = s.split(";");
        System.out.println(Arrays.toString(res));
    }
}
