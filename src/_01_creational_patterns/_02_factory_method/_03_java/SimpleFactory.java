package _01_creational_patterns._02_factory_method._03_java;


import _01_creational_patterns._02_factory_method._02_after.ship.Blackship;
import _01_creational_patterns._02_factory_method._02_after.ship.Whiteship;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")) {
            return new Blackship();
        }

        throw new IllegalArgumentException();
    }
}