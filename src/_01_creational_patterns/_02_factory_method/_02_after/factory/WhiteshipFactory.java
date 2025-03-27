package _01_creational_patterns._02_factory_method._02_after.factory;

import _01_creational_patterns._02_factory_method._02_after.ship.Ship;
import _01_creational_patterns._02_factory_method._02_after.ship.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
