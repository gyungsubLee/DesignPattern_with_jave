package _03_behavioral_patterns._22_template._02_after.callback;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process((sum, number)-> sum += number);
//        int result = fileProcessor.process((sum, number)-> sum *= number);
        System.out.println(result);
    }
}
