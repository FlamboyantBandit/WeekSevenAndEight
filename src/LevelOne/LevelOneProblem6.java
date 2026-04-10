// Program to find the sum of n natural numbers using a loop in a method
import java.util.Scanner;

class LevelOneProblem6 {

    // Method to find the sum of n natural numbers using a loop
    public static long sumOfNaturalNumbers(int n) {
        long sum = 0;
        // Loop from 1 to n and add each number to sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a positive integer n: ");
        int n = input.nextInt();

        // Validate input
        if (n <= 0) {
            System.err.println("Invalid input. Please enter a positive integer.");
            System.exit(0);
        }

        // Call the method to find sum of n natural numbers
        long sum = sumOfNaturalNumbers(n);

        // Display the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        // Close Scanner
        input.close();
    }
}
