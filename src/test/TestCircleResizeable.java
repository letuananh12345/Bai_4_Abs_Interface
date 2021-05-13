package test;

import shape.Circle;

public class TestCircleResizeable {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new CircleResizeable(3.1);
        circles[1] = new CircleResizeable();
        circles[2] = new CircleResizeable(6,"red",false);

        System.out.println("Pre-resize:");
        for (Circle circle: circles) {
            System.out.println(circle.getArea());
        }
        System.out.println("After-resize:");
        for (Circle circle:
                circles) {
            if (circle instanceof CircleResizeable){
                ((CircleResizeable)circle).reSize((int)(Math.random()*100));
            }
            System.out.println(circle.getArea());
        }
    }
}
