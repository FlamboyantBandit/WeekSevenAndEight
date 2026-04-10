// Program to find the maximum number of handshakes among students
import java.util.Scanner;

class LevelOneProblem2 {

    // Method to calculate the maximum number of handshakes using combination formula
    public static int calculateHandshakes(int numberOfStudents) {
        // Formula: n * (n - 1) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return handshakes;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get integer input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate input
        if (numberOfStudents < 2) {
            System.err.println("Invalid input. At least 2 students are required for a handshake.");
            System.exit(0);
        }

        // Call the method to calculate handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display the number of possible handshakes
        System.out.println("The maximum number of possible handshakes among "
                + numberOfStudents + " students is: " + handshakes);

        // Close Scanner
        input.close();
    }
}
