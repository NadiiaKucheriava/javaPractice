import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaxElementTask {

    private static final int NUMBER_OF_INPUT = 3;
    private static final String MESSAGE = "Please enter number to define maximum value: ";

    public void execute() {
        int[] userInput = InputUtil.getUserInput(MESSAGE, NUMBER_OF_INPUT);
        System.out.println("Max number is: " + findMaxValueInList(userInput));
    }

    private static int findMaxValueInList(int[] array) {
        int max = 0;
        if (array.length != 0) {
            max = array[0];
            for (int element : array) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

}
