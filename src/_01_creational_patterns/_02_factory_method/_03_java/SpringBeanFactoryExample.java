package _01_creational_patterns._02_factory_method._03_java;


import spring_dumy.AnnotationConfigApplicationContext;
import spring_dumy.BeanFactory;

public class SpringBeanFactoryExample {

    public static void main(String[] args) {
//        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
//        String hello = xmlFactory.getBean("hello", String.class);
//        System.out.println(hello);

        BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
        String hi = javaFactory.getBean("hello", String.class);
        System.out.println(hi);
    }
}
