// Coding Exercise 11 Solution:
// See README.md for full challenge description

public class CodingExercise11 {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1,-1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int numOne, int numTwo, int numThree) {
        if (numOne < 0 || numTwo < 0 || numThree < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (numOne == numTwo && numTwo == numThree) {
            System.out.println("All numbers are equal");
            return;
        } else if (numOne != numTwo && numOne != numThree && numTwo != numThree) {
            System.out.println("All numbers are different");
            return;
        }

        System.out.println("Neither all are equal or different");
    }
}
