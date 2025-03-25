package singleton.v1;

public class Settings {

    private static Settings instance;

    private Settings() {}

    public static Settings getInstance() {
        // NOTES: 멀티스레딩 환경에서 동시성 문제가 발생될 수 있다.
        if (instance == null) {
            instance = new Settings();
        }

        return instance;
    }
}
