// Coding Exercise 12 Solution:
// See README.md for full challenge description
public class CodingExercise12 {

    public static void main(String[] args) {
        System.out.println("True/False: the cat is playing if it's summer and the temperature is 10: " + isCatPlaying(true, 10));
        System.out.println("True/False: the cat is playing if it's not summer and the temperature is 36: " + isCatPlaying(false, 36));
        System.out.println("True/False: the cat is playing if it's not summer and the temperature is 35: " + isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int maxTemp = summer ? 45 : 35;
        return temperature >= 25 && temperature <= maxTemp;
    }
}
