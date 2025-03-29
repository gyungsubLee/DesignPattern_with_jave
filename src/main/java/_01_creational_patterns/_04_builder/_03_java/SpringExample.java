package _01_creational_patterns._04_builder._03_java;

import demo.uriComponents.UriComponents;
import demo.uriComponents.UriComponentsBuilder;

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
