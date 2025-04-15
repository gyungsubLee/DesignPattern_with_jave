package _03_behavioral_patterns._14_command._01_before;

public class Button {

    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        if (light.getIsOn()) {
            light.off();
        } else {
            light.on();
        }
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
