package _01_creational_patterns._01_singleton.v6.reflection;

import _01_creational_patterns._01_singleton.v6.Settings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings = Settings.INSTANCE;

        // Error) java.lang.IllegalArgumentException: Cannot reflectively create enum objects
        Settings settings1 = null;
        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
        for ( Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            settings1 = (Settings) constructor.newInstance("INSTANCE");
        }

        System.out.println(settings == settings1);
    }
}
