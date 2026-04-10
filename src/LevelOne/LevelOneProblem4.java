// Program to check whether a number is positive, negative, or zero using a method
import java.util.Scanner;

class LevelOneProblem4 {

    // Method to check the sign of a number
    // Returns 1 for positive, -1 for negative, 0 for zero
    public static int checkSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call the method to check sign
        int result = checkSign(number);

        // Display the result based on return value
        if (result == 1) {
            System.out.println(number + " is a Positive number.");
        } else if (result == -1) {
            System.out.println(number + " is a Negative number.");
        } else {
            System.out.println(number + " is Zero.");
        }

        // Close Scanner
        input.close();
    }
}
