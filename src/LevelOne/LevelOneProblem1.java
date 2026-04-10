// Program to calculate Simple Interest using a method
import java.util.Scanner;

class LevelOneProblem1 {

    // Method to calculate simple interest given principal, rate, and time
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Simple Interest formula: P * R * T / 100
        double simpleInterest = principal * rate * time / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for principal, rate, and time
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = input.nextDouble();

        // Validate inputs
        if (principal <= 0 || rate <= 0 || time <= 0) {
            System.err.println("Invalid input. All values must be positive.");
            System.exit(0);
        }

        // Call the method to calculate simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest
                + " for Principal " + principal
                + ", Rate of Interest " + rate
                + " and Time " + time);

        // Close Scanner
        input.close();
    }
}
