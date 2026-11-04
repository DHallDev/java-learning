// Coding Exercise 16 Solution:
// See README.md for full challenge description
public class CodingExercise17 {

    public static void main(String[] args) {
        System.out.println("252 = " + sumFirstAndLastDigit(252));
        System.out.println("257 = " + sumFirstAndLastDigit(257));
        System.out.println("0 = " + sumFirstAndLastDigit(0));
        System.out.println("5 = " + sumFirstAndLastDigit(5));
        System.out.println("-10 = " + sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit > 9) {
            firstDigit /= 10;
        }
        return firstDigit + lastDigit;
    }
}
