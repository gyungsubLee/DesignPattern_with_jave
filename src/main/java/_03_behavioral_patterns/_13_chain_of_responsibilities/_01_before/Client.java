package _03_behavioral_patterns._13_chain_of_responsibilities._01_before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("테스트용 문구");
        LoggingRequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);
    }
}
