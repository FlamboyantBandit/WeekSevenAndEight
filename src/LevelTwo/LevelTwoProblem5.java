// UnitConvertor utility class - yards, feet, inches, meters conversions
import java.util.Scanner;

class LevelTwoProblem5 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Yards to feet
        System.out.print("Enter distance in yards: ");
        double yards = input.nextDouble();
        System.out.printf("%.2f yards = %.4f feet%n", yards, convertYardsToFeet(yards));

        // Feet to yards
        System.out.print("\nEnter distance in feet: ");
        double feet = input.nextDouble();
        System.out.printf("%.2f feet = %.4f yards%n", feet, convertFeetToYards(feet));

        // Meters to inches
        System.out.print("\nEnter distance in meters: ");
        double meters = input.nextDouble();
        System.out.printf("%.2f meters = %.4f inches%n", meters, convertMetersToInches(meters));

        // Inches to meters
        System.out.print("\nEnter distance in inches: ");
        double inches = input.nextDouble();
        System.out.printf("%.2f inches = %.4f meters%n", inches, convertInchesToMeters(inches));

        // Inches to cm
        System.out.print("\nEnter distance in inches (to convert to cm): ");
        double inches2 = input.nextDouble();
        System.out.printf("%.2f inches = %.4f cm%n", inches2, convertInchesToCm(inches2));

        // Close Scanner
        input.close();
    }
}
