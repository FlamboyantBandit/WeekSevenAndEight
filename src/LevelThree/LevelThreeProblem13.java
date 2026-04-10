// Program to generate random PCM scores, compute totals/averages/percentages, and display scorecard
import java.util.Scanner;

class LevelThreeProblem13 {

    // Method to generate random 2-digit scores (10-99) for Physics, Chemistry, Math
    // Returns 2D array: rows = students, columns = [Physics, Chemistry, Maths]
    public static int[][] generatePCMScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10; // Physics
            scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int) (Math.random() * 90) + 10; // Maths
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    // Returns 2D array: [total, average, percentage] per student (rounded to 2 digits)
    public static double[][] calculateStats(int[][] scores) {
        int maxMarksPerSubject = 100;
        int numberOfSubjects = 3;
        double[][] stats = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / numberOfSubjects;
            double percentage = (double) total / (maxMarksPerSubject * numberOfSubjects) * 100;

            // Round to 2 digits using Math.round()
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    // Helper: determine grade from percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Method to display the scorecard in tabular format using "\t"
    public static void displayScoreCard(int[][] scores, double[][] stats) {
        System.out.println("\n--- Student Scorecard ---");
        System.out.println("Student\tPhysics\tChem\tMaths\tTotal\tAverage\tPercent\tGrade");
        System.out.println("-".repeat(72));
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2],
                    getGrade(stats[i][2]));
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate input
        if (numberOfStudents <= 0) {
            System.err.println("Invalid input. Number of students must be positive.");
            System.exit(0);
        }

        // Generate random PCM scores using method
        int[][] scores = generatePCMScores(numberOfStudents);

        // Calculate total, average, and percentage using method
        double[][] stats = calculateStats(scores);

        // Display the scorecard using method
        displayScoreCard(scores, stats);

        // Close Scanner
        input.close();
    }
}
