import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GradeTask {

    private static final int NUMBER_OF_INPUT = 1;
    private static final String MESSAGE = "Please enter score to define grade: ";

    public void execute() {
        int userInput = InputUtil.getUserInput(MESSAGE, NUMBER_OF_INPUT)[NUMBER_OF_INPUT - 1];
        System.out.println("Grade is: " + calculateGrade(userInput));
    }

    private static Character calculateGrade(int score) {
        if (score > 100 || score < 0) {
            log.error("Score value should be from 0 to 100!");
            return null;
        } else if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else if (score >= 50) {
            return 'E';
        } else return 'F';
    }

}
