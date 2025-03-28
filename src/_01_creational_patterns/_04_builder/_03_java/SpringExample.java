package _01_creational_patterns._04_builder._03_java;

import spring_dumy.util.UriComponents;
import spring_dumy.util.UriComponentsBuilder;

public class SpringExample {

    public static void main(String[] args) {
        UriComponents howToStudyJava = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.whiteship.me")
                .path("java playlist ep1")
                .build();

        System.out.println(howToStudyJava);
    }
}
