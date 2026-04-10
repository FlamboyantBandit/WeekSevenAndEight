// Program to find BMI of 10 team members using 2D array and methods
import java.util.Scanner;

class LevelTwoProblem10 {

    // Define team size
    static int teamSize = 10;

    // Method to calculate BMI for all persons and populate the 2D array
    // personData columns: [0]=weight(kg), [1]=height(cm), [2]=BMI
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            // Convert height from cm to meters
            double heightInMeters = personData[i][1] / 100.0;
            // BMI formula: weight / (height in meters)^2
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine BMI status for all persons and return the status array
    public static String[] determineBMIStatus(double[][] personData) {
        String[] weightStatus = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        return weightStatus;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // 2D array: 10 rows, 3 columns [weight, height(cm), BMI]
        double[][] personData = new double[teamSize][3];

        // Take user input for weight and height of each person
        System.out.println("Enter weight (kg) and height (cm) for each team member:");
        for (int i = 0; i < teamSize; i++) {
            System.out.print("\nPerson " + (i + 1) + " - Weight (kg): ");
            personData[i][0] = input.nextDouble();

            // Validate weight
            if (personData[i][0] <= 0) {
                System.out.println("Invalid weight. Please enter a positive value.");
                i--;
                continue;
            }

            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            personData[i][1] = input.nextDouble();

            // Validate height
            if (personData[i][1] <= 0) {
                System.out.println("Invalid height. Please enter a positive value.");
                i--;
            }
        }

        // Calculate BMI using method
        calculateBMI(personData);

        // Determine weight status using method
        String[] weightStatus = determineBMIStatus(personData);

        // Display the results in tabular format
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-14s %-14s %-10s %-15s%n",
                "Person", "Weight (kg)", "Height (cm)", "BMI", "Status");
        for (int i = 0; i < teamSize; i++) {
            System.out.printf("%-10d %-14.2f %-14.2f %-10.2f %-15s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        // Close Scanner
        input.close();
    }
}
