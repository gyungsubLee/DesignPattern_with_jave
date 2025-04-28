package _03_behavioral_patterns._23_visitor._02_after;

import _03_behavioral_patterns._23_visitor._02_after.device.Device;
import _03_behavioral_patterns._23_visitor._02_after.device.Phone;
import _03_behavioral_patterns._23_visitor._02_after.shape.Rectangle;
import _03_behavioral_patterns._23_visitor._02_after.shape.Shape;

public class Client {

    public static void main(String[] args) {
//        Device device = new Pad();
        Device device = new Phone();
//        Shape shape = new Circle();
        Shape shape = new Rectangle();
        shape.accept(device);
    }
}
