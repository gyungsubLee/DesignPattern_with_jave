package spring_dumy;

public interface BeanFactory {
    <T> T getBean(Class<T> clazz);

    <S, T> T getBean(S arg, Class<T> Clazz);
}
