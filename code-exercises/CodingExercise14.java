public class CodingExercise14 {

    public static void main(String[] args) {
        System.out.println("Is 2000 a lear year? " + isLeapYear(2000));
        System.out.println("March has how many days in the year 2000: " + getDaysInMonth(5, 2000));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 2 -> !isLeapYear(year) ? 28 : 29;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }
}

