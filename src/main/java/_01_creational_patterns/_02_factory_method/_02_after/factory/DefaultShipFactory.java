package _01_creational_patterns._02_factory_method._02_after.factory;

import _01_creational_patterns._02_factory_method._02_after.ship.Ship;

public abstract class DefaultShipFactory implements ShipFactory{

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
