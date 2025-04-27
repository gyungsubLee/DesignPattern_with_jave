package _03_behavioral_patterns._23_visitor._01_before;

import _03_behavioral_patterns._23_visitor._01_before.device.Device;
import _03_behavioral_patterns._23_visitor._01_before.device.Watch;
import _03_behavioral_patterns._23_visitor._01_before.shape.Circle;
import _03_behavioral_patterns._23_visitor._01_before.shape.Shape;

public class Client {

    public static void main(String[] args) {
//        Device device = new Phone();
        Device device = new Watch();
        Shape shape = new Circle();
        shape.printTo(device);
    }
}
