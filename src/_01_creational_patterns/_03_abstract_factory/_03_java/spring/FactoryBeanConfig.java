package _01_creational_patterns._03_abstract_factory._03_java.spring;

import demo.beanContainer.annotation.Bean;
import demo.beanContainer.annotation.Configuration;


@Configuration
public class FactoryBeanConfig {

    @Bean
    public ShipFactory shipFactory() {
        return new ShipFactory();
    }
}
