// Program to find Euclidean distance and equation of a line given two points
import java.util.Scanner;

class LevelThreeProblem12 {

    // Method to find the Euclidean distance between two points
    public static double findEuclideanDistance(double x1, double y1,
                                                double x2, double y2) {
        // distance = sqrt((x2-x1)^2 + (y2-y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of a line given two points
    // Returns [slope (m), y-intercept (b)]
    public static double[] findLineEquation(double x1, double y1,
                                             double x2, double y2) {
        // Slope: m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);

        // Y-intercept: b = y1 - m * x1
        double b = y1 - m * x1;

        return new double[]{m, b};
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take inputs for 2 points
        System.out.println("Enter coordinates for 2 points:");
        System.out.print("Point 1 - x1: ");
        double x1 = input.nextDouble();
        System.out.print("Point 1 - y1: ");
        double y1 = input.nextDouble();

        System.out.print("Point 2 - x2: ");
        double x2 = input.nextDouble();
        System.out.print("Point 2 - y2: ");
        double y2 = input.nextDouble();

        // Validate: x1 and x2 must not be equal (vertical line has undefined slope)
        if (x1 == x2) {
            System.err.println("Invalid input. x1 and x2 cannot be equal (vertical line has no defined slope).");
            System.exit(0);
        }

        // Calculate Euclidean distance
        double distance = findEuclideanDistance(x1, y1, x2, y2);

        // Find line equation
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        // Display results
        System.out.printf("%nEuclidean Distance  : %.4f%n", distance);
        System.out.printf("Slope (m)           : %.4f%n", slope);
        System.out.printf("Y-Intercept (b)     : %.4f%n", yIntercept);
        System.out.printf("Line Equation       : y = %.4fx + %.4f%n", slope, yIntercept);

        // Close Scanner
        input.close();
    }
}
