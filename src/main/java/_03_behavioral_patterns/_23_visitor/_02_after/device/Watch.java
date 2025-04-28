package _03_behavioral_patterns._23_visitor._02_after.device;


import _03_behavioral_patterns._23_visitor._02_after.shape.Circle;
import _03_behavioral_patterns._23_visitor._02_after.shape.Rectangle;
import _03_behavioral_patterns._23_visitor._02_after.shape.Triangle;

public class Watch implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("Print Circle to Watch");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Print Rectangle to Watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Print Triangle to Watch");
    }
}
