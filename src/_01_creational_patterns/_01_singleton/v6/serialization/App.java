package _01_creational_patterns._01_singleton.v6.serialization;

import _01_creational_patterns._01_singleton.v6.Settings;

import java.io.*;

/**
 * enum 사용 시 내부적으로 Serializable 상속한다.
 * 이떄,
 */

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        _01_creational_patterns._01_singleton.v6.Settings settings = Settings.INSTANCE;

        Settings settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings) in.readObject();
        }
        System.out.println(settings == settings1); // true
    }
}
