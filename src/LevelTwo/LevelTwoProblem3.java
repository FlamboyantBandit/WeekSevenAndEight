// Program to check whether a given year is a Leap Year
import java.util.Scanner;

class LevelTwoProblem3 {

    // Method to check if a year is a Leap Year
    // Only valid for years >= 1582 (Gregorian calendar)
    // Leap year: divisible by 4 AND (not divisible by 100 OR divisible by 400)
    public static boolean isLeapYear(int year) {
        // Check if year is in the valid Gregorian calendar range
        if (year < 1582) {
            return false;
        }

        // Leap year condition
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Validate year range
        if (year < 1582) {
            System.err.println("Invalid year. This program only works for years >= 1582 (Gregorian calendar).");
            System.exit(0);
        }

        // Call the method and display the result
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        // Close Scanner
        input.close();
    }
}
