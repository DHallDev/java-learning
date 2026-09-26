public class Main {

    public static void main(String[] args) {
        System.out.println("68in in centimeters is " + convertToCentimeters(68) + "cm.");
        System.out.println("5ft 8in in centimeters is " +
                convertToCentimeters(5, 8) + "cm.");
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = (feet * 12) + inches;

        return convertToCentimeters(totalInches);
    }
}
