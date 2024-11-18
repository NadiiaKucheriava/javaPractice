package shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Circle extends Shape {

    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
