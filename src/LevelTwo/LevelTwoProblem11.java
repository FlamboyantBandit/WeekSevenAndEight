// Program to find the roots of a quadratic equation ax^2 + bx + c
import java.util.Scanner;

class LevelTwoProblem11 {

    // Method to find the roots of a quadratic equation
    // Returns an array of roots: [root1, root2] for two roots,
    // [root] for one root, or empty array for no real roots
    public static double[] findQuadraticRoots(double a, double b, double c) {
        // Calculate delta = b^2 + 4 * a * c  (note: standard formula uses b^2 - 4ac, PDF uses +)
        // Following the PDF formula exactly
        double delta = Math.pow(b, 2) + 4 * a * c;

        // If delta is positive, two distinct real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
        // If delta is zero, one real root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        // If delta is negative, no real roots - return empty array
        else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take a, b, c as input values
        System.out.println("Enter coefficients for the quadratic equation ax^2 + bx + c:");
        System.out.print("a: ");
        double a = input.nextDouble();

        System.out.print("b: ");
        double b = input.nextDouble();

        System.out.print("c: ");
        double c = input.nextDouble();

        // Validate: a cannot be 0 (not a quadratic equation)
        if (a == 0) {
            System.err.println("Invalid input. Coefficient 'a' cannot be zero for a quadratic equation.");
            System.exit(0);
        }

        // Call the method to find roots
        double[] roots = findQuadraticRoots(a, b, c);

        // Display the result based on number of roots
        System.out.println("\nEquation: " + a + "x^2 + " + b + "x + " + c);
        if (roots.length == 2) {
            System.out.printf("Two real roots:%n  Root 1 = %.4f%n  Root 2 = %.4f%n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("One real root:%n  Root = %.4f%n", roots[0]);
        } else {
            System.out.println("No real roots (delta is negative).");
        }

        // Close Scanner
        input.close();
    }
}
