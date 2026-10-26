//Method Challenge Solution:
//See README.md for full challenge description

public class MethodChallenge {

    public static void main(String[] args) {
//        First Approach of solving the challenge:
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("James", highScorePosition);

//        Second Approach of solving the challenge:
        displayHighScore("Grace", 1500);
        displayHighScore("Bob", 1000);
        displayHighScore("Lily", 500);
        displayHighScore("Frank", 100);
        displayHighScore("Shakespeare", 25);


    }

    public static void displayHighScorePosition(String playerName, int playerHighScorePosition) {
        System.out.println(playerName + " managed to get into position " + playerHighScorePosition +
                " on the high score list!");
    }

    public static void displayHighScore(String playerName, int playerScore) {
        int playerHighScorePosition = calculateHighScorePosition(playerScore);
        System.out.println(playerName + " managed to get into position " + playerHighScorePosition +
                " on the high score list!");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
