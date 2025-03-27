package spring_dumy;

public interface BeanFactory {
    <T> T getBean(Class<T> clazz);

    <T> T getBean(String name, Class<T> Clazz);
}
