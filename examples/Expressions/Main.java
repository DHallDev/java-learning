// Lesson: Expressions
// The purpose of this file is to show what Java constitutes as an expression

public class Main {

    public static void main(String[] args) {
        int int2 = 5;    // <- int is a keyword in Java and can't be used by itself to name Java identifiers

        double kilometers = (100 * 1.609344);    // <- kilometers = (100 * 1.609344) is the expression

        /*
        Expressions in this block:
        - highScore = 50                    -> assignment expression
        - highScore > 25                    -> comparison expression
        - highScore = 1000 + highScore      -> assignment + arithmetic expression
        - 1000 + highScore                  -> arithmetic expression
         */

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;
        }

        /*
        Count Number of Expressions Challenge:
        1. health = 100
        2. (health < 25)
        3. (highScore > 1000)
        4. (health < 25) && (highScore > 1000)
        5. highScore - 1000;
        6. highScore = highScore - 1000;
         */
        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
    }
}
