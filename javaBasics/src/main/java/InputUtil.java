import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

@Slf4j
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class InputUtil {

    public static int[] getUserInput(String message, int numberOfInput) {
        Scanner reader = new Scanner(new InputStreamReader(System.in));
        int[] input = new int[numberOfInput];
        try {
            for (int i = 0; i < numberOfInput; i++) {
                System.out.printf(message + "[%s] %n", i);
                System.out.print(">");
                input[i] = reader.nextInt();
            }
        } catch (InputMismatchException e) {
            log.error("Entered value should be digit! {}", e.toString());
            input = getUserInput(message, numberOfInput);
        } catch (NoSuchElementException | IllegalStateException e) {
            log.error("Exception while reading input line", e);
        } finally {
            try {
                reader.close();
            } catch (IllegalStateException e) {
                log.error("IllegalStateException while closing input reader", e);
            }
        }
        return input;
    }

}
