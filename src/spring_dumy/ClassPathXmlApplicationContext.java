package spring_dumy;

public class ClassPathXmlApplicationContext implements ApplicationContext{
    public ClassPathXmlApplicationContext(String s) {
    }

    @Override
    public <T> T getBean(Class<T> clazz) {
        return null;
    }

    @Override
    public <S, T> T getBean(S arg, Class<T> Clazz) {
        return null;
    }
}
