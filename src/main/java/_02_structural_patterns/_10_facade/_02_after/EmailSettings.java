package _02_structural_patterns._10_facade._02_after;

public class EmailSettings {

    private final String host;

    public EmailSettings(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }
}
