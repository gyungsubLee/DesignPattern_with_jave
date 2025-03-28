package _01_creational_patterns._01_singleton.breaker.deserialization;

import java.io.*;

public class SerializationBreaker {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            Settings settings = Settings.getInstance();
            Settings settings1 = null;
            try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
                out.writeObject(settings);
            }
            try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
                settings1 = (Settings) in.readObject();
            }
            System.out.println(settings == settings1); // false
        }
}