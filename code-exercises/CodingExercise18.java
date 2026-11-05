// Coding Exercise 18 Solution:
// See README.md for full challenge description
public class CodingExercise18 {

    public static void main(String[] args) {
        System.out.println("All even numbers added in 123456789 equals: " + getEvenDigitSum(123456789));
        System.out.println("All even numbers added in 252 equals: " + getEvenDigitSum(252));
        System.out.println("All even numbers added in -22 equals: " + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        for (int i = number, lastDigit = 0; i != 0; i /= 10) {
            lastDigit = i % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
        }
        return sum;
    }
}
