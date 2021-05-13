package test;

import resize.Resizeable;
import shape.Square;

public class SquareResizeable extends Square implements Resizeable {
    public SquareResizeable() {
    }

    public SquareResizeable(double side) {
        super(side);
    }

    public SquareResizeable(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public void reSize(double percent) {
        if (percent <= 100 && percent >= 1) {
            this.setSide(getSide() + (getSide() * (percent / 100)));
        }

    }
}
