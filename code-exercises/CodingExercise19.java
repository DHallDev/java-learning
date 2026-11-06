// Coding Exercise 19 Solution:
// See README.md for full challenge description
public class CodingExercise19 {

    public static void main (String[] args) {
        System.out.println("Do 12 & 23 have a shared digit: " + hasSharedDigit(12,23));
        System.out.println("Do 9 & 99 have a shared digit: " + hasSharedDigit(9,99)); // Should return false since 9 is less than 10
        System.out.println("Do 15 & 55 have a shared digit: " + hasSharedDigit(15,55));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num1FirstDigit = num1 / 10;
        int num2FirstDigit = num2 / 10;

        return num1FirstDigit == num2FirstDigit ||
                num1FirstDigit == num2LastDigit ||
                num1LastDigit == num2FirstDigit ||
                num1LastDigit == num2LastDigit;
    }
}
