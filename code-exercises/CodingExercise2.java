// Coding Exercise 2 Solution:
// See README.md for full challenge description

public class CodingExercise2 {

    public static void main(String[] args) {
        System.out.println("toMilesPerHour test below:");
        toMilesPerHour(0);
        toMilesPerHour(1.5);
        toMilesPerHour(10.25);
        toMilesPerHour(-5.6);
        toMilesPerHour(25.42);
        toMilesPerHour(75.114);
        System.out.println();

        System.out.println("printConversion tests below:");
        printConversion(0);
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long convertedMiles = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + convertedMiles + " mi/h");
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }
}
