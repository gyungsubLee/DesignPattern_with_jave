package _03_behavioral_patterns._14_command._01_before;

public class Light {

    private boolean isOn;

    public Light() {
        this.isOn = false;
    }

    public void on() {
        if (!isOn) {
            System.out.println("불을 켭니다.");
            isOn = true;
        } else {
            System.out.println("이미 불이 켜졌습니다.");
        }
    }

    public void off() {
        if (isOn) {
            System.out.println("불을 끕니다.");
            isOn = false;
        } else {
            System.out.println("이미 불이 꺼졌습니다.");
        }
    }

    public boolean getIsOn() {
        return isOn;
    }

}
