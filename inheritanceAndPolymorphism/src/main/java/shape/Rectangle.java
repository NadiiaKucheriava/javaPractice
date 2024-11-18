package shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rectangle extends Shape {

    private double height;
    private double width;

    @Override
    public double calculateArea() {
        return height * width;
    }

}
