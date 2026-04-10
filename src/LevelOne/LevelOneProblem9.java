// Program to divide N chocolates among M children using a method
import java.util.Scanner;

class LevelOneProblem9 {

    // Method to find chocolates per child and remaining chocolates
    // Returns an array: [chocolatesPerChild, remainingChocolates]
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Validate inputs
        if (numberOfChocolates <= 0 || numberOfChildren <= 0) {
            System.err.println("Invalid input. Both values must be positive.");
            System.exit(0);
        }

        // Call the method to divide chocolates
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display the results
        System.out.println("\nTotal Chocolates: " + numberOfChocolates);
        System.out.println("Total Children:   " + numberOfChildren);
        System.out.println("Each child gets:  " + result[0] + " chocolate(s)");
        System.out.println("Remaining:        " + result[1] + " chocolate(s)");

        // Close Scanner
        input.close();
    }
}
