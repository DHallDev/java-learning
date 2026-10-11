public class Main {

    public static void main(String[] args) {

        int number = 5;
        int finishedNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishedNumber) {
            if (isEvenNumber(number)) {
                System.out.println("Even Number: " + number);
                evenCount++;
            } else {
                oddCount++;
            }
            if (evenCount == 5) {
                break;
            }
            number++;
        }

        System.out.println("Total odd numbers found: " + oddCount);
        System.out.println("Total even numbers found: " + evenCount);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
