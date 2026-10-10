public class Main {

    public static void main(String[] args) {

        System.out.println("125 summed up should be 8: " + sumDigits(125));
        System.out.println("1000 summed up should be 1: " + sumDigits(1000));
        System.out.println("-125 should return -1: " + sumDigits(-125));
        System.out.println("4 should return 4: " + sumDigits(4));
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }
}
