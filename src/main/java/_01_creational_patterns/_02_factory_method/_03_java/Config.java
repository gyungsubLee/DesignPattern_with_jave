package _01_creational_patterns._02_factory_method._03_java;

import demo.beanContainer.annotation.Bean;
import demo.beanContainer.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String hello() {
        return "hello";
    }
}