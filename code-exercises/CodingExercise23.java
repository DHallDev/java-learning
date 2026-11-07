// Coding Exercise 23 Solution:
// See README.md for full challenge description
public class CodingExercise23 {

    public static void main(String[] args) {
        System.out.println("Is 6 a perfect number: " + isPerfectNumber(6));
        System.out.println("Is 28 a perfect number: " + isPerfectNumber(28));
        System.out.println("Is 5 a perfect number: " + isPerfectNumber(5));
        System.out.println("Is -1 a perfect number: " + isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return number == sum;
    }
}
