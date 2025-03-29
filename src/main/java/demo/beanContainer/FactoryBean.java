package demo.beanContainer;

public interface FactoryBean<T> {

    T getObject();

    Class<?> getObjectType();
}
