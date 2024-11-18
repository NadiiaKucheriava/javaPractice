package testRunner;

import lombok.extern.slf4j.Slf4j;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

@Slf4j
public class TestRunner {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(12, 15.5);
        Shape circle = new Circle(7);
        Shape square = new Square(4);

        log.info("Rectangle area: {}", rectangle.calculateArea());
        log.info("Circle area: {}", circle.calculateArea());
        log.info("Square area: {}", square.calculateArea());
    }

}
