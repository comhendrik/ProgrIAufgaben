package mail;

public class MailNachricht {
    private String absender;
    private String empfaenger;
    private String text;
    private String betreff;

    public MailNachricht(String absender, String empfaenger, String text, String betreff) {
        this.absender = absender;
        this.empfaenger = empfaenger;
        this.text = text;
        this.betreff = betreff;
    }

    public String getAbsender() {
        return absender;
    }

    public String getEmpfaenger() {
        return empfaenger;
    }

    public String getText() {
        return text;
    }

    public String getBetreff() {
        return betreff;
    }

    public String toString() {
        String s = "";

        s += "Von: " + absender;
        s += "An: " + empfaenger;
        s += "Betreff: " + betreff;
        s += "Text: " + text;

        return s;
    }
}
