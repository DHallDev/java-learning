// Coding Exercise 24 Solution:
// See README.md for full challenge description
public class CodingExercise25 {

    public static void main(String[] args) {
        boolean testCase1 = canPack(1,0,4);
        boolean testCase2 = canPack(1,0,5);
        boolean testCase3 = canPack(0,5,4);
        boolean testCase4 = canPack(2,2,11);
        boolean testCase5 = canPack(-3,2,12);

        System.out.println(testCase1);
        System.out.println(testCase2);
        System.out.println(testCase3);
        System.out.println(testCase4);
        System.out.println(testCase5);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigBagsThatFit = goal / 5;
        if (bigBagsThatFit > bigCount) {
            bigBagsThatFit = bigCount;
        }

        int remainingGoal = goal - (bigBagsThatFit * 5);
        return remainingGoal <= smallCount;
    }
}
