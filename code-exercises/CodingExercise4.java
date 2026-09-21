// Coding Exercise 4 Solution:
// See README.md for full challenge description

public class CodingExercise4 {

    public static void main(String[] args) {
        boolean testWakeUp1 = shouldWakeUp(true, 1);
        boolean testWakeUp2 = shouldWakeUp(false, 2);
        boolean testWakeUp3 = shouldWakeUp(true, 8);
        boolean testWakeUp4 = shouldWakeUp(true, -1);

        System.out.println("After running testWakeUp1: Should I wake up? " + testWakeUp1);
        System.out.println("After running testWakeUp2: Should I wake up? " + testWakeUp2);
        System.out.println("After running testWakeUp3: Should I wake up? " + testWakeUp3);
        System.out.println("After running testWakeUp4: Should I wake up? " + testWakeUp4);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0) {
            return false;
        }

        return barking && (hourOfDay < 8 || hourOfDay == 23);
    }
}
