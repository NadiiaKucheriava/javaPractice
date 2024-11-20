import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TrianglePatternTask {

    private static final int NUMBER_OF_INPUT = 1;
    private static final String MESSAGE = "Please enter number of rows to print triangle: ";

    public void execute() {
        printTriangle(InputUtil.getUserInput(MESSAGE, NUMBER_OF_INPUT)[NUMBER_OF_INPUT - 1]);
    }

    private void printTriangle(int numberOfRows) {
        if (numberOfRows > 0) {
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            log.error("Rows number should be more then 0!");
        }
    }

}
