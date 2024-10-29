package test.testRunner;

import test.shape.Circle;
import test.shape.Rectangle;
import test.shape.Shape;
import test.shape.Square;

public class TestRunner {
    public static void main(String[] args){
        Shape rectangle = new Rectangle(12, 15.5);
        Shape circle = new Circle(7);
        Shape square = new Square(4);

        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());
    }
}
