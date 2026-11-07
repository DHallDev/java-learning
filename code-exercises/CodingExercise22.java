// Coding Exercise 22 Solution:
// See README.md for full challenge description
public class CodingExercise22 {

    public static void main(String[] args) {
        System.out.println("The GCD between 25 and 15: " + getGreatestCommonDivisor(25,15));
        System.out.println("The GCD between 12 and 30: " + getGreatestCommonDivisor(12,30));
        System.out.println("The GCD between 9 and 18: " + getGreatestCommonDivisor(9,18)); // Should return -1 since on of the parameters is less than 10
        System.out.println("The GCD between 81 and 153: " + getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int smallestNum = Math.min(first, second);
        int largestNum = Math.max(first, second);

        if (largestNum % smallestNum == 0) {
            return smallestNum;
        }

        int gcd = 1;
        for (int i = 2; i <= (smallestNum / 2); i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
