public class CodingExercise4 {

    public static void main(String[] args) {

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0) {
            return false;
        }

        return barking && (hourOfDay < 8 || hourOfDay == 23);
    }
}
