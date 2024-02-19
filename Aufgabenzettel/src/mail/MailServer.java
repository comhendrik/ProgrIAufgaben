package mail;

import java.util.*;

public class MailServer {

    private ArrayList<MailNachricht> nachrichten;

    public MailServer() {
        nachrichten = new ArrayList<MailNachricht>();
    }

    public int anzahlNachrichtenFuer(String benutzer) {
        int anzahl = 0;
        for (MailNachricht nachricht : nachrichten) {
            if (nachricht.getEmpfaenger().equals(benutzer))
                anzahl++;
        }
        return anzahl;
    }

    public MailNachricht getNaechsteNachrichtFuer(String benutzer) {
        for (MailNachricht nachricht : nachrichten) {
            if (nachricht.getEmpfaenger().equals(benutzer)) {
                nachrichten.remove(nachricht);
                return nachricht;
            }
        }
        return null;
    }

    public void leiteWeiter(MailNachricht nachricht) {
        nachrichten.add(nachricht);
    }
}
