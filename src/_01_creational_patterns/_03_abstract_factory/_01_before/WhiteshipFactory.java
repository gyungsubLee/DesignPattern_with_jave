package _01_creational_patterns._03_abstract_factory._01_before;


import _01_creational_patterns._02_factory_method._02_after.factory.DefaultShipFactory;
import _01_creational_patterns._02_factory_method._02_after.ship.Ship;
import _01_creational_patterns._02_factory_method._02_after.ship.Whiteship;


// 클라이언트 코드
public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
