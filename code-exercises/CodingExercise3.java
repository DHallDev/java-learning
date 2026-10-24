// Coding Exercise 3 Solution:
// See README.md for full challenge description

public class CodingExercise3 {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int kiloBytesToMegaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + kiloBytesToMegaBytes + " MB and " + remainingKiloBytes + " KB");
    }
}

