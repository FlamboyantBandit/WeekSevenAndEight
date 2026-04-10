// Program to calculate wind chill temperature using a method
import java.util.Scanner;

class LevelOneProblem10 {

    // Method to calculate wind chill temperature
    // Formula: windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * windSpeed^0.16
    public double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74
                + 0.6215 * temperature
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = input.nextDouble();

        // Validate wind speed (must be positive)
        if (windSpeed <= 0) {
            System.err.println("Invalid input. Wind speed must be positive.");
            System.exit(0);
        }

        // Create object and call the method
        LevelOneProblem10 calculator = new LevelOneProblem10();
        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.printf("%nTemperature : %.2f°F%n", temperature);
        System.out.printf("Wind Speed  : %.2f mph%n", windSpeed);
        System.out.printf("Wind Chill  : %.2f°F%n", windChill);

        // Close Scanner
        input.close();
    }
}
