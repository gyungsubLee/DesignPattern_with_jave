package _01_creational_patterns._03_abstract_factory._01_before;


import _01_creational_patterns._02_factory_method._02_after.factory.DefaultShipFactory;
import _01_creational_patterns._02_factory_method._02_after.ship.Ship;
import _01_creational_patterns._02_factory_method._02_after.ship.Whiteship;


// 클라이언트 코드
public class WhiteshipFactory extends DefaultShipFactory {

    /**
     * 문제점
     * 1. 구체 클래스에 의존하고 있음 (SRP & DIP 위반)
     *  * WhiteshipFactory는 Ship을 생성하는 역할만 하면 되는데, 어떤 Anchor와 Wheel을 사용하는지까지 알고 있음
     *      -> 단일 책임 원칙(SRP) 위반
     *
     *  * WhiteAnchor, WhiteWheel이라는 구체 클래스에 직접 의존
     *     -> 의존성 역전 원칙(DIP) 위반
     *
     * 2. 확장이 어렵다
     *  * 새로운 제품군(예: BlackShip, GoldShip)을 추가할 때마다, 각 Ship에 맞는 Anchor, Wheel을 일일이 수동으로 주입해야 함.
     *
     * 3. 테스트와 재사용이 어렵다
     *  * new WhiteAnchor()와 같은 직접 생성 로직이 박혀있으면, Mocking이나 Stubbing이 어려워짐.
     * 	* 테스트 코드에서 WhiteAnchor를 대체할 수 없음 → 결합도가 높음
     */
    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
