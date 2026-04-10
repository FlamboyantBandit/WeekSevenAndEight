// UnitConvertor utility class - temperature, weight, and volume conversions
import java.util.Scanner;

class LevelTwoProblem6 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9.0 / 5.0) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.printf("%.2f°F = %.4f°C%n", fahrenheit, convertFahrenheitToCelsius(fahrenheit));

        // Celsius to Fahrenheit
        System.out.print("\nEnter temperature in Celsius: ");
        double celsius = input.nextDouble();
        System.out.printf("%.2f°C = %.4f°F%n", celsius, convertCelsiusToFahrenheit(celsius));

        // Pounds to kilograms
        System.out.print("\nEnter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.printf("%.2f lbs = %.4f kg%n", pounds, convertPoundsToKilograms(pounds));

        // Kilograms to pounds
        System.out.print("\nEnter weight in kilograms: ");
        double kilograms = input.nextDouble();
        System.out.printf("%.2f kg = %.4f lbs%n", kilograms, convertKilogramsToPounds(kilograms));

        // Gallons to liters
        System.out.print("\nEnter volume in gallons: ");
        double gallons = input.nextDouble();
        System.out.printf("%.2f gallons = %.4f liters%n", gallons, convertGallonsToLiters(gallons));

        // Liters to gallons
        System.out.print("\nEnter volume in liters: ");
        double liters = input.nextDouble();
        System.out.printf("%.2f liters = %.4f gallons%n", liters, convertLitersToGallons(liters));

        // Close Scanner
        input.close();
    }
}
