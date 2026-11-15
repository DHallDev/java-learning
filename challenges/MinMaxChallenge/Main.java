import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int count = 0;

        do {
            System.out.print("Enter a number, or any character to exit: ");
            String input = scanner.nextLine();
            try {
                min = (count == 0) ? Integer.parseInt(input) : Math.min(min, Integer.parseInt(input));
                max = (count == 0) ? Integer.parseInt(input) : Math.max(min, Integer.parseInt(input));
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        } while (true);

        if (count == 0) {
            System.out.println("No valid data entered.");
            return;
        }
        System.out.println("Minimum Number: " + min + "\nMaximum Number: " + max + "\nTotal numbers entered: " + count);
    }
}
