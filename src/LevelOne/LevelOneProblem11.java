// Program to calculate trigonometric functions (sine, cosine, tangent) given an angle in degrees
import java.util.Scanner;

class LevelOneProblem11 {

    // Method to calculate trigonometric functions for a given angle in degrees
    // Returns an array: [sine, cosine, tangent]
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        // Create object and call the method
        LevelOneProblem11 trigCalc = new LevelOneProblem11();
        double[] results = trigCalc.calculateTrigonometricFunctions(angle);

        // Display the trigonometric values
        System.out.println("\nTrigonometric Functions for " + angle + " degrees:");
        System.out.printf("Sine    : %.6f%n", results[0]);
        System.out.printf("Cosine  : %.6f%n", results[1]);
        System.out.printf("Tangent : %.6f%n", results[2]);

        // Close Scanner
        input.close();
    }
}
