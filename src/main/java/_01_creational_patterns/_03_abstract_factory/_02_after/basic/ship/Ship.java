package _01_creational_patterns._03_abstract_factory._02_after.basic.ship;

import _01_creational_patterns._03_abstract_factory._02_after.basic.parts.Anchor;
import _01_creational_patterns._03_abstract_factory._02_after.basic.parts.Wheel;

public class Ship {
    private String name;
    private String color;
    private String logo;
    private Anchor anchor;
    private Wheel wheel;

    // getter
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getLogo() {
        return logo;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public Wheel getWheel() {
        return wheel;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    // toString

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                ", anchor=" + anchor +
                ", wheel=" + wheel +
                '}';
    }
}
