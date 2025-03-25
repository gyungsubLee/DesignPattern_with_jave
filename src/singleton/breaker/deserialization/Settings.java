package singleton.breaker.deserialization;

import java.io.Serializable;

public class Settings implements Serializable {
    // Serializable ID 생략..

    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}


