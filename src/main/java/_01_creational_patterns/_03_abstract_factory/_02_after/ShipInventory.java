package _01_creational_patterns._03_abstract_factory._02_after;


import _01_creational_patterns._03_abstract_factory._02_after.basic.factory.ShipFactory;
import _01_creational_patterns._03_abstract_factory._02_after.basic.ship.Ship;
import _01_creational_patterns._03_abstract_factory._02_after.case1.WhiteshipPartsFactory;
import _01_creational_patterns._03_abstract_factory._02_after.case2.WhitePartsProFactory;

/** Notes ( 클라이언트 )                                                                  <br/>
 * 1. 상위 형식(interface)로 구성된 추상 팩토리 정의 [ ShipPartsFactory ]                       <br/>
 * {@link _01_creational_patterns._03_abstract_factory._02_after.ShipPartsFactory}     <br/><br/>
 *
 * 2. 구현체 팩토리들을 주입할 '기본 팩토리 구현체' 정의 [ WhiteshipFactory ]                      <br/>
 * {@link _01_creational_patterns._03_abstract_factory._02_after.WhiteshipFactory}     <br/><br/>
 *
 * 3, 여러 하위 구현체 팩토리 정의 [ case1, case2 참조]                                        <br/>
 * {@link _01_creational_patterns._03_abstract_factory._02_after.case1}                <br/>
 * {@link _01_creational_patterns._03_abstract_factory._02_after.case2}                <br/><br/>
 *
 * 4. '기본 구현체 팩토리'에 여러 하위 구현체 팩토리를 인자로 넘김                                   <br/><br/>
 *
 * '기본 팩토리 생성자'에 어떤 '하위 팩토리 인스턴스'를 넣어주느냐에 따라 각기 다른 제품군을 생성할 수 있다.   <br/>
 * 또한 추상 팩토리를 구현하여 다른 제품군을 쉽게 확장할 수 있다.                                     <br/>
 *
 */
public class ShipInventory {

    public static void main(String[] args) {

        // Case 1: WhiteshipPartsFactory
        ShipFactory shipFactory1 = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship1 = shipFactory1.createShip();
        System.out.println(ship1.getAnchor().getClass()); // WhiteAnchor
        System.out.println(ship1.getWheel().getClass());  // WhiteWheel

        // Case 2: WhitePartsProFactory
        ShipFactory shipFactory2 = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship2 = shipFactory2.createShip();
        System.out.println(ship2.getAnchor().getClass());  // WhiteAnchorPro
        System.out.println(ship2.getWheel().getClass());   // WhiteWheelPro
    }
}
