import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestRunner {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "RAV4", 1000.0, 2021);
        Car car2 = new Car("BMW", "i8", 500.0, 2024);
        log.info(car1.toString());
        log.info(car2.toString());
    }

}