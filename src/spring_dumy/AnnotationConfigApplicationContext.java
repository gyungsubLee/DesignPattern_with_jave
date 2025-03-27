package spring_dumy;

import spring_dumy.annotation.Bean;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class AnnotationConfigApplicationContext implements ApplicationContext {

    private final Map<Class<?>, Object> beanMap = new HashMap<>();

    public AnnotationConfigApplicationContext(Class<?> configClass) {
        try {
            Object configInstance = configClass.getDeclaredConstructor().newInstance();

            for (Method method : configClass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Bean.class)) {
                    Object returnObj = method.invoke(configInstance);

                    if (returnObj instanceof FactoryBean<?> factoryBean) {
                        Object obj = factoryBean.getObject();
                        Class<?> type = factoryBean.getObjectType();
                        beanMap.put(type, obj); // Ship.class -> Ship 객체 등록
                    } else {
                        beanMap.put(method.getReturnType(), returnObj);
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("빈 등록 중 오류 발생", e);
        }
    }

    @Override
    public <T> T getBean(Class<T> clazz) {
        return clazz.cast(beanMap.get(clazz));
    }

    @Override
    public <S, T> T getBean(S arg, Class<T> Clazz) {
        return null;
    }
}
