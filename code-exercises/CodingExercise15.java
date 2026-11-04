// Coding Exercise 15 Solution:
// See README.md for full challenge description
public class CodingExercise15 {

    public static void main(String[] args) {

        System.out.println("The sum of all odd numbers between 1 and 15 = " + sumOdd(1, 15));
        System.out.println("The sum of all odd numbers between 7 and 33 = " + sumOdd(7, 33));

        System.out.println("True/False: 14 is odd = " + isOdd(14));
        System.out.println("True/False: 15 is odd = " + isOdd(15));
    }

    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || start < 0) {
            return -1;
        }

        int oddStart = isOdd(start) ? start : start + 1;
        int sumOfOddNumbers = 0;

        for (; oddStart <= end; oddStart += 2) {
            sumOfOddNumbers += oddStart;
        }
        return sumOfOddNumbers;
    }
}
