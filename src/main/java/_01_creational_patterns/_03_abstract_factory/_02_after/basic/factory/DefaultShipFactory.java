package _01_creational_patterns._03_abstract_factory._02_after.basic.factory;


import _01_creational_patterns._03_abstract_factory._02_after.basic.ship.Ship;

public abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
