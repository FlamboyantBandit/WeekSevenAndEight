// Program to check if 3 points are collinear using slope and area of triangle methods
import java.util.Scanner;

class LevelThreeProblem10 {

    // Method to check collinearity using slope formula
    // AB, BC, and AC slopes must all be equal
    public static boolean areCollinearBySlope(double x1, double y1,
                                               double x2, double y2,
                                               double x3, double y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Points are collinear if all three slopes are equal
        // Use a small epsilon for floating-point comparison
        double epsilon = 1e-9;
        return Math.abs(slopeAB - slopeBC) < epsilon
                && Math.abs(slopeBC - slopeAC) < epsilon;
    }

    // Method to check collinearity using area of triangle formula
    // Points are collinear if area = 0
    public static boolean areCollinearByArea(double x1, double y1,
                                              double x2, double y2,
                                              double x3, double y3) {
        // Area formula: 0.5 * |x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)|
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take inputs for 3 points
        System.out.println("Enter coordinates for 3 points:");
        System.out.print("Point A - x1: ");
        double x1 = input.nextDouble();
        System.out.print("Point A - y1: ");
        double y1 = input.nextDouble();

        System.out.print("Point B - x2: ");
        double x2 = input.nextDouble();
        System.out.print("Point B - y2: ");
        double y2 = input.nextDouble();

        System.out.print("Point C - x3: ");
        double x3 = input.nextDouble();
        System.out.print("Point C - y3: ");
        double y3 = input.nextDouble();

        // Check collinearity using slope method
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Check collinearity using area method
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("\nPoints: A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ")");
        System.out.println("Collinear by Slope Method : " + collinearBySlope);
        System.out.println("Collinear by Area Method  : " + collinearByArea);

        // Close Scanner
        input.close();
    }
}
