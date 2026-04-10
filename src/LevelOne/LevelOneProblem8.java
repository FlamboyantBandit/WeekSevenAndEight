// Program to find the quotient and remainder of two numbers using a method
import java.util.Scanner;

class LevelOneProblem8 {

    // Method to find the remainder and quotient of a division
    // Returns an array: [quotient, remainder]
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter the dividend (number): ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Validate: divisor cannot be zero
        if (divisor == 0) {
            System.err.println("Invalid input. Divisor cannot be zero.");
            System.exit(0);
        }

        // Call the method to find quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the results
        System.out.println("\nQuotient:  " + result[0]);
        System.out.println("Remainder: " + result[1]);

        // Close Scanner
        input.close();
    }
}
