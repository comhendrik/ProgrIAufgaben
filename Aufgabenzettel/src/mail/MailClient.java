package mail;

import java.util.ArrayList;

public class MailClient {
    // der Server zum Senden und Empfangen
    private MailServer server;
    // der Benutzer, dem dieser Client zugeordnet ist
    private String benutzer;

    private ArrayList<MailNachricht> gesendeteNachrichten;

    private ArrayList<MailNachricht> empfangeneNachrichten;

    public MailClient(MailServer server, String benutzer) {
        this.server = server;
        this.benutzer = benutzer;
        gesendeteNachrichten = new ArrayList<>();
        empfangeneNachrichten = new ArrayList<>();
    }

    public MailNachricht getNaechsteNachricht() {
        MailNachricht nachricht = server.getNaechsteNachrichtFuer(benutzer);
        if (nachricht != null) empfangeneNachrichten.add(nachricht);
        return nachricht;
    }

    public void naechsteNachrichtAusgeben() {
        MailNachricht nachricht = getNaechsteNachricht();
        if (nachricht == null)
            System.out.println("Keine neue Nachricht.");
        else
            nachricht.toString();
    }

    public void sendeNachricht(String empfaenger, String text, String betreff) {
        MailNachricht nachricht = new MailNachricht(benutzer, empfaenger, text, betreff);
        server.leiteWeiter(nachricht);
        gesendeteNachrichten.add(nachricht);
    }

    public void empfangeAlleNachrichten() {
        MailNachricht empfangeneNachricht;
        do {
            empfangeneNachricht = getNaechsteNachricht();
        } while(empfangeneNachricht != null);
    }

    public void druckeEmpfangeneNachrichten() {
        for (MailNachricht nachricht: empfangeneNachrichten) {
            System.out.println(nachricht.toString());
        }
    }

    public void druckeGesendeteNachrichten() {
        for (MailNachricht nachricht: gesendeteNachrichten) {
            System.out.println(nachricht.toString());
        }
    }


}
