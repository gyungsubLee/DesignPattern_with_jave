package spring_dumy;

public class ClassPathXmlApplicationContext implements ApplicationContext{
    public ClassPathXmlApplicationContext(String s) {
    }

    @Override
    public <T> T getBean(Class<T> clazz) {
        return null;
    }

    @Override
    public <T> T getBean(String name, Class<T> Clazz) {
        return null;
    }
}
