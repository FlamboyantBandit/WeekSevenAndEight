// Program to check if 10 students can vote using a method
import java.util.Scanner;

class LevelTwoProblem7 {

    // Method to check if a student can vote based on age
    // Returns true if age >= 18, false otherwise
    public boolean canStudentVote(int age) {
        // Validate: negative age is invalid, return false
        if (age < 0) {
            return false;
        }
        // Return true if age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create an instance of the class
        LevelTwoProblem7 checker = new LevelTwoProblem7();

        // Define the number of students
        int totalStudents = 10;

        // Define an array of 10 integer elements for student ages
        int[] ages = new int[totalStudents];

        // Loop through the array and take user input for each student's age
        System.out.println("Enter the ages of " + totalStudents + " students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Loop through and check voting eligibility for each student
        System.out.println("\nVoting Eligibility:");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + "): Invalid age.");
            } else if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + "): Can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + "): Cannot vote.");
            }
        }

        // Close Scanner
        input.close();
    }
}
