// Program to find how many rounds an athlete must complete in a triangular park for a 5km run
import java.util.Scanner;

class LevelOneProblem3 {

    // Method to compute the number of rounds needed to complete the target distance
    public static double calculateRounds(double side1, double side2, double side3, double targetDistanceMeters) {
        // Perimeter of the triangle is the sum of all sides (in meters)
        double perimeter = side1 + side2 + side3;

        // Rounds = total distance / perimeter
        double rounds = targetDistanceMeters / perimeter;
        return rounds;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define the target distance (5 km = 5000 meters)
        double targetDistanceKm = 5;
        double targetDistanceMeters = targetDistanceKm * 1000;

        // Take user input for the 3 sides of the triangle (in meters)
        System.out.println("Enter the 3 sides of the triangular park in meters:");
        System.out.print("Side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Side 2: ");
        double side2 = input.nextDouble();

        System.out.print("Side 3: ");
        double side3 = input.nextDouble();

        // Validate inputs
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.err.println("Invalid input. All sides must be positive.");
            System.exit(0);
        }

        // Call the method to calculate rounds
        double rounds = calculateRounds(side1, side2, side3, targetDistanceMeters);

        // Display the result
        System.out.printf("\nPerimeter of the park: %.2f meters%n", (side1 + side2 + side3));
        System.out.printf("To complete a %.0f km run, the athlete must complete %.2f rounds.%n",
                targetDistanceKm, rounds);

        // Close Scanner
        input.close();
    }
}
