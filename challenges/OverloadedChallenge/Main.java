public class Main {

    public static void main(String[] args) {
        String validString1 = getDurationString(3624);
        String invalidString1 = getDurationString(-3600);
        String validString2 = getDurationString(96, 45);
        String invalidString2 = getDurationString(-96, 45);
        String invalidString3 = getDurationString(88, 145);

        System.out.println(validString1);
        System.out.println(invalidString1);

        System.out.println(validString2);
        System.out.println(invalidString2);
        System.out.println(invalidString3);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Seconds can't be negative: (" + seconds + ").";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Minutes can't be negative: (" + minutes + ").";
        }

        if (seconds < 0 || seconds > 59) {
            return "Seconds are out of bounds (" + seconds + "), must be between 0 and 59.";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
