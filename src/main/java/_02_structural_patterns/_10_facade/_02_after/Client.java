package _02_structural_patterns._10_facade._02_after;

public class Client {

    public static void main(String[] args) {

        EmailSettings settings = new EmailSettings("127.0.0.1");
        EmailSender emailSender = new EmailSender(settings);
        EmailMessage message = new EmailMessage("dltjq2323@gmail,com", "another", "메세지1", "메세지  전송 테스트");
        emailSender.sendEmail(message);

    }
}