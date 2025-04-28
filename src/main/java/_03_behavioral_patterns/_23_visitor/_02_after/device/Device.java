package _03_behavioral_patterns._23_visitor._02_after.device;


import _03_behavioral_patterns._23_visitor._02_after.shape.Circle;
import _03_behavioral_patterns._23_visitor._02_after.shape.Rectangle;
import _03_behavioral_patterns._23_visitor._02_after.shape.Triangle;

public interface Device {
    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}
