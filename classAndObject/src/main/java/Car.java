import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

    private String make;
    private String model;
    private double mileage;
    private int year;

}
