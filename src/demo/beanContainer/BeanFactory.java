package demo.beanContainer;

public interface BeanFactory {
    <T> T getBean(Class<T> clazz);

    <T> T getBean(String name, Class<T> Clazz);
}