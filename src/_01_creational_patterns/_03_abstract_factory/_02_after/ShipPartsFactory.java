package _01_creational_patterns._03_abstract_factory._02_after;

import _01_creational_patterns._03_abstract_factory._02_after.basic.parts.Anchor;
import _01_creational_patterns._03_abstract_factory._02_after.basic.parts.Wheel;

// NOTES: 추상 팩토리 - 하위 팩토리(구현체)들을 생성하기 위해 공통적인 부분을 상위 형식(interface)으로 정의 ( 추상화 )
public interface ShipPartsFactory {

    Anchor createAnchor();
    Wheel createWheel();
}
