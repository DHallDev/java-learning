// Coding Exercise 8 Solution
// See README.md for full challenge description

public class CodingExercise8 {

    public static void main(String[] args) {
        boolean hasTeenMethodTest1 = hasTeen(9, 99, 19);    // true
        boolean hasTeenMethodTest2 = hasTeen(23,15,42);    // true
        boolean hasTeenMethodTest3 = hasTeen(22, 23, 34);    // false

        System.out.println("hasTeenMethodTest1: " + hasTeenMethodTest1);
        System.out.println("hasTeenMethodTest2: " + hasTeenMethodTest2);
        System.out.println("hasTeenMethodTest3: " + hasTeenMethodTest3);

        boolean isTeenMethodTest1 = isTeen(9);    // false
        boolean isTeenMethodTest2 = isTeen(13);    // true;

        System.out.println("isTeenMethodTest1: " + isTeenMethodTest1);
        System.out.println("isTeenMethodTest2: " + isTeenMethodTest2);

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
