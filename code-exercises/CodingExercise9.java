// Coding Exercise 9 Solution:
// See README.md for full challenge description

public class CodingExercise9 {

    public static void main(String[] args) {
        System.out.println("Radius = 6; Area of the Circle = " + area(6));
        System.out.println("Height = 6, Length = 7; Area of the Rectangle = " + area(6,7));
        System.out.println("Invalid: Radius = -6; Area of the Circle = " + area(-6));
        System.out.println("Invalid: Height = -6, Length = 7; Area of the Rectangle = " + area(-6, 7));
        System.out.println("Invalid: Height = 6, Length = -7; Area of the Rectangle = " + area(6, -7));
        System.out.println("Invalid: Height = -6, Length = -7; Area of the Rectangle = " + area(-6, -7));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }
}
