// Program to find factors of a number and perform various operations using the factors array
import java.util.Scanner;

class LevelThreeProblem7 {

    // Method to find factors of a number and return them as an array
    // First loop: count the factors; Second loop: store the factors
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find the greatest factor using the factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > greatest) greatest = factors[i];
        }
        return greatest;
    }

    // Method to find the sum of the factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) sum += factors[i];
        return sum;
    }

    // Method to find the product of the factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) product *= factors[i];
        return product;
    }

    // Method to find the product of the cube of the factors using Math.pow()
    public static double findProductOfCubeOfFactors(int[] factors) {
        double productOfCubes = 1;
        for (int i = 0; i < factors.length; i++) {
            productOfCubes *= Math.pow(factors[i], 3);
        }
        return productOfCubes;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a positive integer.");
            System.exit(0);
        }

        // Find factors using the method
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("\nFactors of " + number + ": ");
        for (int f : factors) System.out.print(f + " ");

        // Display all computed values
        System.out.println("\n\nGreatest Factor         : " + findGreatestFactor(factors));
        System.out.println("Sum of Factors          : " + findSumOfFactors(factors));
        System.out.println("Product of Factors      : " + findProductOfFactors(factors));
        System.out.printf("Product of Cubes        : %.2f%n", findProductOfCubeOfFactors(factors));

        // Close Scanner
        input.close();
    }
}
