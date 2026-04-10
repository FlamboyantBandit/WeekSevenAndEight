// UnitConvertor utility class - Distance conversions (km/miles, meters/feet)
import java.util.Scanner;

class LevelTwoProblem4 {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Demonstrate km to miles conversion
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        System.out.printf("%.2f km = %.4f miles%n", km, convertKmToMiles(km));

        // Demonstrate miles to km conversion
        System.out.print("\nEnter distance in miles: ");
        double miles = input.nextDouble();
        System.out.printf("%.2f miles = %.4f km%n", miles, convertMilesToKm(miles));

        // Demonstrate meters to feet conversion
        System.out.print("\nEnter distance in meters: ");
        double meters = input.nextDouble();
        System.out.printf("%.2f meters = %.4f feet%n", meters, convertMetersToFeet(meters));

        // Demonstrate feet to meters conversion
        System.out.print("\nEnter distance in feet: ");
        double feet = input.nextDouble();
        System.out.printf("%.2f feet = %.4f meters%n", feet, convertFeetToMeters(feet));

        // Close Scanner
        input.close();
    }
}
