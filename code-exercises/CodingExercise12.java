public class CodingExercise12 {

    public static void main(String[] args) {
        System.out.println("isCatPlaying(true, 10): " + isCatPlaying(true, 10));
        System.out.println("isCatPlaying(false, 36): " + isCatPlaying(false, 36));
        System.out.println("isCatPlaying(false, 35): " + isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int lowerLimit = 25;
        int upperLimit = (!summer) ? 35 : 45;

        return temperature >= lowerLimit && temperature <= upperLimit;
    }
}
