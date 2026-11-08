// Coding Exercise 24 Solution:
// See README.md for full challenge description
public class CodingExercise24 {

    public static void main(String[] args) {
        // getDigitCount() test
        System.out.println("0 has " + getDigitCount(0) + " digits.");
        System.out.println("123 has " + getDigitCount(123) + " digits.");
        System.out.println("-12 has " + getDigitCount(-12) + " digits."); // Should return -1
        System.out.println("5,200 has " + getDigitCount(5200) + " digits.\n");

        // reverse() test
        System.out.println("-121 in reverse: " + reverse(-121));
        System.out.println("1212 in reverse: " + reverse(1212));
        System.out.println("1234 in reverse: " + reverse(1234));
        System.out.println("100 in reverse: " + reverse(100) + "\n"); // Should return 1

        // numberToWords() test
        numberToWords(123);
        System.out.println();
        numberToWords(1010);
        System.out.println();
        numberToWords(1000);
        System.out.println();
        numberToWords(-12); // Should print "Invalid Value"
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int numberInReverse = reverse(number);
        int trailingZeros = getDigitCount(number) - getDigitCount(numberInReverse);

        while (numberInReverse != 0) {
            int lastDigit = numberInReverse % 10;
            System.out.println(switch (lastDigit) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Invalid Value";
            });
            numberInReverse /= 10;
        }

        for (int i = 0; i < trailingZeros; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        for (int i = number; i != 0; i /= 10) {
            reverse *= 10;
            reverse = reverse + (i % 10);
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int digitCount = 0;
        for (int i = number; i != 0; i /= 10) {
            digitCount++;
        }
        return digitCount;
    }
}
