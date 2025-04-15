package _03_behavioral_patterns._14_command._02_after;

import _03_behavioral_patterns._14_command._01_before.Game;
import _03_behavioral_patterns._14_command._01_before.Light;

import java.util.ArrayDeque;
import java.util.Deque;

public class Button {

    // NOTES: Stack - 성능상 이점을 위해 Deque 사용
    // private Stack<Command> commands = new Stack<>();  // 강의 코드
    private Deque<Command> commands = new ArrayDeque<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }
}
