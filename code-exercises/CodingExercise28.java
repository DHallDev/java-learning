// Coding Exercise 28 Solution:
// See README.md for full challenge description
import java.util.Scanner;

public class CodingExercise28 {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int loopCount = 0;

        do {
            try {
                sum += Integer.parseInt(scanner.nextLine());
                loopCount++;
            } catch (NumberFormatException e) {
                break;
            }
        } while (true);

        long avg = Math.round((double) sum / loopCount);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
