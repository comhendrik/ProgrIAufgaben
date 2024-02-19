package mail;

public class MailMain {
    public static void main(String[] args) {
        MailServer server = new MailServer();
        MailClient client = new MailClient(server, "Hendrik");
        MailClient secondClient = new MailClient(server, "Hannes");
        client.sendeNachricht("Hannes", "Hallo", "Nachricht");
        secondClient.empfangeAlleNachrichten();
        secondClient.druckeEmpfangeneNachrichten();
    }
}
