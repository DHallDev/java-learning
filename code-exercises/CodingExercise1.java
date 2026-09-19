// Coding Exercise 1 Solution:
// See README.md for full challenge description

public class CodingExercise1 {

    public static void main(String[] args) {
        checkNumber(-5);
        checkNumber(0);
        checkNumber(5);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
            return;
        } else if (number < 0) {
            System.out.println("negative");
            return;
        }

        System.out.println("zero");
    }
}
