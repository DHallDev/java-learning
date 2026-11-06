// Coding Exercise 20 Solution:
// See README.md for full challenge description
public class CodingExercise20 {

    public static void main(String[] args) {
        System.out.println("Does 41, 22, and 71 share the last digit? " + hasSameLastDigit(41,22,71));
        System.out.println("Does 23, 32, and 42 share the last digit? " + hasSameLastDigit(23,32,42));
        System.out.println("Does 9, 99, and 999 share the last digit? " + hasSameLastDigit(9,99,999)); // Should return false since num1 is less than 10
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        return num1LastDigit == num2LastDigit ||
                num1LastDigit == num3LastDigit ||
                num2LastDigit == num3LastDigit;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
