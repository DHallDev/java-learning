// Coding Exercise 5 Solution:
// See README.md for full challenge description

public class CodingExercise5 {

    public static void main (String[] args) {
        boolean testLeapYear1 = isLeapYear(-1600);
        boolean testLeapYear2 = isLeapYear(1600);
        boolean testLeapYear3 = isLeapYear(2017);
        boolean testLeapYear4 = isLeapYear(2000);

        System.out.println("Is -1600 a leap year = " + testLeapYear1);
        System.out.println("Is 1600 a leap year = " + testLeapYear2);
        System.out.println("Is 2017 a leap year = " + testLeapYear3);
        System.out.println("Is 2000 a leap year = " + testLeapYear4);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
