/*
Method Challenge Solution:
See README.md for full challenge description
 */

public class MethodChallenge {

    public static void main(String[] args) {
        displayHighScore("Grace", calculateHighScore(1500));
        displayHighScore("Bob", calculateHighScore(1000));
        displayHighScore("Lily", calculateHighScore(500));
        displayHighScore("Frank", calculateHighScore(100));
        displayHighScore("Shakespeare", calculateHighScore(25));
    }

    public static void displayHighScore(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition +
                " on the high score list.");
    }

    public static int calculateHighScore(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
