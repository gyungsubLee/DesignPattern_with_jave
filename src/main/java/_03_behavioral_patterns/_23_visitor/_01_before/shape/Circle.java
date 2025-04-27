package _03_behavioral_patterns._23_visitor._01_before.shape;

import _03_behavioral_patterns._23_visitor._01_before.device.Device;
import _03_behavioral_patterns._23_visitor._01_before.device.Phone;

public class Circle implements Shape {

    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("print Circle to phone");
        } else {
            System.out.println("print Circle to watch");
        }
    }
}
