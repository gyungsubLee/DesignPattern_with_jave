package _02_structural_patterns._10_facade._02_after;

public class EmailMessage {
    private final String from;
    private final String cc;
    private final String subject;
    private final String text;

    public EmailMessage(String from, String cc, String subject, String text) {
        this.from = from;
        this.cc = cc;
        this.subject = subject;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public String getCc() {
        return cc;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }
}
