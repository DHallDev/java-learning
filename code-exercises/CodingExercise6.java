// Coding Exercise 6 Solution:
// See README.md for full challenge description

public class CodingExercise6 {

    public static void main(String[] args) {
        boolean testValue1 = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        boolean testValue2 = areEqualByThreeDecimalPlaces(3.175, 3.176);
        boolean testValue3 = areEqualByThreeDecimalPlaces(3.0, 3.0);
        boolean testValue4 = areEqualByThreeDecimalPlaces(-3.123, 3.123);

        System.out.println("testVAlue1 = " + testValue1);
        System.out.println("testVAlue2 = " + testValue2);
        System.out.println("testVAlue3 = " + testValue3);
        System.out.println("testVAlue4 = " + testValue4);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
        return (int) (firstValue * 1000) == (int) (secondValue * 1000);
    }
}
