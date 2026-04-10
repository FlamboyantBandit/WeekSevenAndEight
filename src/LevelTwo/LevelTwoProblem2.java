// Program to find sum of n natural numbers using recursion and formula, then compare
import java.util.Scanner;

class LevelTwoProblem2 {

    // Method to find sum of n natural numbers using recursion
    public static long sumRecursive(int n) {
        // Base case: sum of 1 natural number is 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: n + sum of (n-1) natural numbers
        return n + sumRecursive(n - 1);
    }

    // Method to find sum of n natural numbers using the formula n*(n+1)/2
    public static long sumFormula(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input and validate it is a natural number
        System.out.print("Enter a natural number n: ");
        int n = input.nextInt();

        // Validate: must be a natural number (positive integer)
        if (n <= 0) {
            System.err.println("Invalid input. Please enter a natural number (positive integer).");
            System.exit(0);
        }

        // Calculate using both methods
        long recursiveResult = sumRecursive(n);
        long formulaResult = sumFormula(n);

        // Display and compare both results
        System.out.println("\nSum using Recursion : " + recursiveResult);
        System.out.println("Sum using Formula   : " + formulaResult);

        // Compare the two results
        if (recursiveResult == formulaResult) {
            System.out.println("\nBoth results match! The sum of first " + n + " natural numbers is: " + recursiveResult);
        } else {
            System.out.println("\nResults do not match. There may be an error.");
        }

        // Close Scanner
        input.close();
    }
}
