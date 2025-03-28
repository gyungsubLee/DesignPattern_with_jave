package _01_creational_patterns._03_abstract_factory._03_java.spring;

import _01_creational_patterns._03_abstract_factory._02_after.basic.ship.Ship;
import demo.beanContainer.AnnotationConfigApplicationContext;
import demo.beanContainer.ApplicationContext;

public class FactoryBeanExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship ship = applicationContext.getBean(Ship.class);
        System.out.println("Ship name: " + ship.getName());
    }
}
