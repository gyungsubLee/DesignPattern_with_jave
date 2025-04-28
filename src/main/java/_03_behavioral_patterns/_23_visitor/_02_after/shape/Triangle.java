package _03_behavioral_patterns._23_visitor._02_after.shape;

import _03_behavioral_patterns._23_visitor._02_after.device.Device;

public class Triangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
