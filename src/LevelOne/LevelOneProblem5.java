// Program to check whether a given month and day falls in Spring Season
// Spring Season: March 20 to June 20
import java.util.Scanner;

class LevelOneProblem5 {

    // Method to check if the given month and day falls in Spring Season
    // Spring is from March 20 (month=3, day=20) to June 20 (month=6, day=20)
    public static boolean isSpingSeason(int month, int day) {
        // Check if date is on or after March 20
        boolean afterMarch20 = (month == 3 && day >= 20) || (month > 3);

        // Check if date is on or before June 20
        boolean beforeJune20 = (month == 6 && day <= 20) || (month < 6);

        // Spring if both conditions are met
        return afterMarch20 && beforeJune20;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take month and day as input from the user
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();

        // Validate inputs
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.err.println("Invalid month or day entered.");
            System.exit(0);
        }

        // Call the method to check for Spring season
        boolean spring = isSpingSeason(month, day);

        // Display the result
        if (spring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // Close Scanner
        input.close();
    }
}
