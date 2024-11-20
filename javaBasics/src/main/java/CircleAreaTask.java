import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CircleAreaTask {

    private static final int NUMBER_OF_INPUT = 1;
    private static final String MESSAGE = "Please enter circle radius to calculate area: ";

    public void execute() {
        int userInput = InputUtil.getUserInput(MESSAGE, NUMBER_OF_INPUT)[NUMBER_OF_INPUT - 1];
        System.out.println("Circle area is: " + calculateCircleArea(userInput));
    }

    private Double calculateCircleArea(int radius) {
        if (radius > 0) {
            return Math.PI * Math.pow(radius, 2);
        } else {
            log.error("Radius should be more then 0!");
            return null;
        }
    }

}
