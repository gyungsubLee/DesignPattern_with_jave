package _01_creational_patterns._01_singleton.v6.reflection;

import _01_creational_patterns._01_singleton.v6.Settings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings = Settings.INSTANCE;

        // Error) java.lang.NoSuchMethodException: _01_creational_patterns._01_singleton.v6.Settings.<init>()
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();

        System.out.println(settings == settings1);

    }
}
