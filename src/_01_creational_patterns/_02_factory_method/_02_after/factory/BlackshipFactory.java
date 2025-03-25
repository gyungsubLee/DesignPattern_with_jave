package _01_creational_patterns._02_factory_method._02_after.factory;

import _01_creational_patterns._02_factory_method._02_after.ship.Blackship;
import _01_creational_patterns._02_factory_method._02_after.ship.Ship;

public class BlackshipFactory extends DefaultShipFactory{
    @Override
    public Ship createShip() {
        return new Blackship("blackship", "black", "⚓");
    }
}
