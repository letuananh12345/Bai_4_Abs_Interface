package test;

import resize.Resizeable;
import shape.Rectangle;

public class RectangleResizeable extends Rectangle implements Resizeable {
    public RectangleResizeable() {
    }

    public RectangleResizeable(double width, double length) {
        super(width, length);
    }

    public RectangleResizeable(double width, double length, String color, boolean filled) {
        super(width,length,color,filled);
    }

    @Override
    public void reSize(double percent) {
        if (percent <= 100 && percent >= 1) {
            this.setWidth(getWidth() + (getWidth() * (percent / 100)));
            this.setLength(getLength() + (getLength() * (percent / 100)));
        }

    }
}
