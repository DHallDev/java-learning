// Coding Exercise 27 Solution:
// See README.md for full challenge description
public class CodingExercise27 {

    public static void main(String[] args) {
        printSquareStar(5);
        System.out.println();
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {
                if (row == 1 || row == number ||
                        column == 1 || column == number ||
                        row == column || column == number - row + 1) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
