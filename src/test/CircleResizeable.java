package test;

import resize.Resizeable;
import shape.Circle;

public class CircleResizeable extends Circle implements Resizeable {
    public CircleResizeable() {
    }

    public CircleResizeable(double radius) {
        super(radius);
    }

    public CircleResizeable(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void reSize(double percent) {
        if (percent<=100&&percent>=0){
            this.setRadius(getRadius()+(getRadius()*percent/100));
        }

    }
}
