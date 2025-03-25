package singleton.v5.reflection;

import singleton.v5.Settings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings1 = Settings.getInstance();

        /**
         * NOTES: 리플랙션을 사용한 인스턴스 생성 ( new 를 사용한 인스턴스 생성과 동일하게 새로운 인스턴슬 만든다. )
         *  private 으로 선언된 생성자를 무시하고 강제로 인스턴스를 외부 생성하도록 한다.
         */
        Constructor<Settings> constructor =Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings2 = constructor.newInstance();

        System.out.println(settings1 == settings2);  // false
    }
}