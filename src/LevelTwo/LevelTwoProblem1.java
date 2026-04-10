// Program to find factors of a number and compute sum, product, and sum of squares
import java.util.Scanner;

class LevelTwoProblem1 {

    // Static method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        // First loop: count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the factors array with the count
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find the sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to find the product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // Method to find the sum of squares of factors using Math.pow()
    public static double findSumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int i = 0; i < factors.length; i++) {
            sumOfSquares += Math.pow(factors[i], 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a positive integer.");
            System.exit(0);
        }

        // Find factors using the method
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("\nFactors of " + number + ": ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        // Find and display sum, product, and sum of squares
        System.out.println("\nSum of Factors:           " + findSumOfFactors(factors));
        System.out.println("Product of Factors:       " + findProductOfFactors(factors));
        System.out.println("Sum of Squares of Factors: " + findSumOfSquaresOfFactors(factors));

        // Close Scanner
        input.close();
    }
}
