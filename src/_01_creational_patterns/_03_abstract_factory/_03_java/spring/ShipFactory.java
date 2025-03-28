package _01_creational_patterns._03_abstract_factory._03_java.spring;


import _01_creational_patterns._03_abstract_factory._02_after.basic.ship.Ship;
import demo.beanContainer.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() {
        Ship ship = new Ship();
        ship.setName("ship name");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
