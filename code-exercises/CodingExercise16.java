public class Main {

    public static void main(String[] args) {
        System.out.println("Is -1221 a palindrome? " + isPalindrome(-1221));
        System.out.println("Is 707 a palindrome? " + isPalindrome(707));
        System.out.println("Is 11212 a palindrome? " + isPalindrome(11212));
        System.out.println("Is 121 a palindrome? " + isPalindrome(121));
        System.out.println("Is 0 a palindrome? " + isPalindrome(0));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int numberInReverse = 0;
        while (originalNumber != 0) {
            numberInReverse = (numberInReverse * 10) + (originalNumber % 10);
            originalNumber /= 10;
        }
        return number == numberInReverse;
    }
}
