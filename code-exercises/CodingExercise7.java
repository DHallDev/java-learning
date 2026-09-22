// Coding Exercise 7 Solution:
// See README.md for full challenge description

public class CodingExercise7 {

    public static void main(String[] args) {
        boolean testValue1 = hasEqualSum(1, 1, 1);  // false
        boolean testValue2 = hasEqualSum(1, 1, 2);  // true
        boolean testValue3 = hasEqualSum(1, -1, 0); // true

        System.out.println("testValue1 = " + testValue1);
        System.out.println("testValue2 = " + testValue2);
        System.out.println("testValue3 = " + testValue3);
    }

    public static boolean hasEqualSum(int firstValue, int secondValue, int goal) {
        return firstValue + secondValue == goal;
    }
}
