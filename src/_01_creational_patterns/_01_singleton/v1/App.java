package _01_creational_patterns._01_singleton.v1;

public class App {
    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println(settings1 == settings2);  // true
    }
}
