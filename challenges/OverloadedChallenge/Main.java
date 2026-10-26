public class Main {

    public static void main(String[] args) {
        // First method test
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString( 8625));
        System.out.println(getDurationString(-3945) + "\n");


        // Second method test
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(10067, 5));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value, seconds parameter can't be negative: " + seconds;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid value, minutes parameter can't be negative: " + minutes;
        }
        if (seconds < 0 || seconds > 59) {
            return "Invalid value, seconds parameter must be between 0 and 59: " + seconds;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
