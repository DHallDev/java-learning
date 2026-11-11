// Coding Exercise 26 Solution:
// See README.md for full challenge description
public class CodingExercise26 {

    public static void main(String[] args) {
        int testCase1 = getLargestPrime(21);
        int testCase2 = getLargestPrime(217);
        int testCase3 = getLargestPrime(0);
        int testCase4 = getLargestPrime(45);
        int testCase5 = getLargestPrime(-1);
        System.out.println(testCase1);
        System.out.println(testCase2);
        System.out.println(testCase3);
        System.out.println(testCase4);
        System.out.println(testCase5);
    }

    public static int getLargestPrime(int number) {
        // 1. Check if the parameter is valid.
        if (number <= 1) {
            return -1;
        }

        int temp = number;
        int primeFactor = 2;
        while (primeFactor <= temp) {
            if (temp % primeFactor != 0) {
                primeFactor++;
                continue;
            }
            temp /= primeFactor;
        }
        return temp == 1 ? primeFactor : number;
    }
}
