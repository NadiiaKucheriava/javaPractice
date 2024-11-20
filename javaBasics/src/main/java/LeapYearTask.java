import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LeapYearTask {

    private static final int NUMBER_OF_INPUT = 1;
    private static final String MESSAGE = "Please enter year to define it's leap:";

    public void execute() {
        int userInput = InputUtil.getUserInput(MESSAGE, NUMBER_OF_INPUT)[NUMBER_OF_INPUT - 1];
        System.out.println(isLeapYear(userInput) ? "Is a leap year" : "Is not a leap year");
    }

    private static boolean isLeapYear(int year) {
        if (year > 0) {
            return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        } else {
            log.error("Year value should be more then 0!");
            return false;
        }
    }

}

