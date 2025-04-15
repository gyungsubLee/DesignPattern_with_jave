package _03_behavioral_patterns._14_command._01_before;

public class MyApp {

    private Game game;

    public MyApp(Game game) {
        this.game = game;
    }

    public void press() {
        if (game.getIsStarted()) {
            game.end();
        } else {
            game.start();
        }
    }

    public static void main(String[] args) {
        MyApp app = new MyApp(new Game());
        app.press();
        app.press();
        app.press();
        app.press();
    }
}
