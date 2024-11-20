import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Main {
    public static void main(String[] args) {
        int[] arrayOfElements = {123, 435, 1, 5, 3, 11, 1150};
        int[] emptyArray = {};

        log.info("Max element of array: {}", findMaxValueInArray(arrayOfElements));
        log.info("Max element of array: {}", findMaxValueInArray(emptyArray));

        log.info("Average of array: {}", calculateAverage(arrayOfElements));
        log.info("Average of array: {}", calculateAverage(emptyArray));

        log.info("Reversed array:{}", Arrays.toString(reverseArray(arrayOfElements)));
    }

    private static int findMaxValueInArray(int[] array) {
        int max = 0;
        try {
            max = array[0];
            for (int element : array) {
                if (element > max) {
                    max = element;
                }
            }
        } catch (IndexOutOfBoundsException exception) {
            log.error("Array is empty!", exception);
        }
        return max;
    }

    private static double calculateAverage(int[] array) {
        int sum = 0;
        double average = 0.0;
        try {
            for (int element : array) {
                sum += element;
            }
            average = (double) sum / array.length;
            if (Double.isNaN(average)) {
                throw new ArithmeticException("/ Double division by zero");
            }
        } catch (ArithmeticException exception) {
            log.error("Array is empty!", exception);
        }
        return average;
    }

    private static int[] reverseArray(int[] array) {
        int tempValue;
        for (int i = 0; i < array.length / 2; i++) {
            tempValue = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tempValue;
        }
        return array;
    }

}