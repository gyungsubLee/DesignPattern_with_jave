package spring_dumy;

public interface FactoryBean<T> {

    T getObject();

    Class<?> getObjectType();
}
