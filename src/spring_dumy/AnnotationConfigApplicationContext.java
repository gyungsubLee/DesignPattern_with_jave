package spring_dumy;

import spring_dumy.annotation.Bean;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class AnnotationConfigApplicationContext implements ApplicationContext {

    private final Map<Class<?>, Object> beanMap = new HashMap<>();
    private final Map<String, Object> namedBeanMap = new HashMap<>();

    public AnnotationConfigApplicationContext(Class<?> configClass) {
        try {
            Object configInstance = configClass.getDeclaredConstructor().newInstance();

            for (Method method : configClass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Bean.class)) {
                    Object returnObj = method.invoke(configInstance);
                    String beanName = method.getName();

                    if (returnObj instanceof FactoryBean<?> factoryBean) {
                        Object obj = factoryBean.getObject();
                        Class<?> type = factoryBean.getObjectType();
                        beanMap.put(type, obj);
                        namedBeanMap.put(beanName, obj);
                    } else {
                        beanMap.put(method.getReturnType(), returnObj);
                        namedBeanMap.put(beanName, returnObj);
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
    public <T> T getBean(String name, Class<T> clazz) {
        return clazz.cast(namedBeanMap.get(name));
    }

}
