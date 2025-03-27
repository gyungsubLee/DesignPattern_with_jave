package _01_creational_patterns._02_factory_method._03_java;

import spring_dumy.annotation.Bean;
import spring_dumy.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String hello() {
        return "hello";
    }
}