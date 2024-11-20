public class TwoValuesTask {

    private static final int NUMBER_OF_INPUT = 2;
    private static final String MESSAGE = "Please enter value to swap: ";

    public void execute() {
        int[] userInput = InputUtil.getUserInput(MESSAGE, NUMBER_OF_INPUT);
        swapVales(userInput[0], userInput[NUMBER_OF_INPUT - 1]);
    }

    private void swapVales(int value1, int value2) {
        value1 = value1 + value2;
        value2 = value1 - value2;
        value1 = value1 - value2;
        System.out.println("Swapped values: first value = " + value1 + ", second value = " + value2);
    }

}
