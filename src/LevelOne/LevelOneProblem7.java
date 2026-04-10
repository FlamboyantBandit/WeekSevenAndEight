// Program to find the smallest and largest of 3 numbers using a single method
import java.util.Scanner;

class LevelOneProblem7 {

    // Single method to find both the smallest and largest of three numbers
    // Returns an array: [smallest, largest]
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        // Compare with number2
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }

        // Compare with number3
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for 3 numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Call the method to find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the results
        System.out.println("\nSmallest number: " + result[0]);
        System.out.println("Largest number:  " + result[1]);

        // Close Scanner
        input.close();
    }
}
