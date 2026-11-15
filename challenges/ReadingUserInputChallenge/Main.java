import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        do {
            System.out.print("Enter #" + count + ": ");
            try {
                sum += Integer.parseInt(scanner.nextLine());
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
        } while (count <= 5);

        System.out.println("The sum is " + sum);
    }
}
