package _01_creational_patterns._03_abstract_factory._02_after.case2;

import _01_creational_patterns._03_abstract_factory._02_after.ShipPartsFactory;
import _01_creational_patterns._03_abstract_factory._02_after.basic.parts.Anchor;
import _01_creational_patterns._03_abstract_factory._02_after.basic.parts.Wheel;

public class WhitePartsProFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
