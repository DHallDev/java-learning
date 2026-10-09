// Coding Exercise 2 Solution:
// See README.md for full challenge description

public class CodingExercise2 {

    public static void main(String[] args) {
        
        double testKm1 = 1.609;
        double testKm2 = -15;
        double testKm3 = 16.65;

        printConversion(testKm1);
        printConversion(testKm2);
        printConversion(testKm3);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }
}
