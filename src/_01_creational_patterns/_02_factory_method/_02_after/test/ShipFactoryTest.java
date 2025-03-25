package _01_creational_patterns._02_factory_method._02_after.test;

import _01_creational_patterns._02_factory_method._02_after.factory.BlackshipFactory;
import _01_creational_patterns._02_factory_method._02_after.factory.ShipFactory;
import _01_creational_patterns._02_factory_method._02_after.factory.WhiteshipFactory;
import _01_creational_patterns._02_factory_method._02_after.ship.Ship;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipFactoryTest {
    ShipFactory whiteShipFactory = new WhiteshipFactory();
    ShipFactory blackShipFactory = new BlackshipFactory();

    @Test
    void createWhtiteshipTest() {
        // given
        String name = "whiteship";
        String color = "white";
        String logo = "\uD83D\uDEE5";

        // when
        Ship whiteShip = whiteShipFactory.createShip();

        // then
        assertEquals(name, whiteShip.getName());
        assertEquals(color, whiteShip.getColor());
        assertEquals(logo, whiteShip.getLogo());
    }

    @Test
    void createBlackshipTest() {
        // given
        String name = "blackship";
        String color = "black";
        String logo = "⚓";

        // when
        Ship blackship = blackShipFactory.createShip();

        // then
        assertEquals(name, blackship.getName());
        assertEquals(color, blackship.getColor());
        assertEquals(logo, blackship.getLogo());
    }

}