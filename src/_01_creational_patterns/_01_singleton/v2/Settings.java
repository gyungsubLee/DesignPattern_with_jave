package _01_creational_patterns._01_singleton.v2;

/**
  구현) synchronized
    * 매번 동기화 연산(synchronized)이 발생되어 성능에 약간 불이득이 있다.
    * 락을 통한 제어 비용 발생
*/
public class Settings {
    private static Settings instance;

    private Settings() { }

    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
