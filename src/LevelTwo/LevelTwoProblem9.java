// Program to check positive/negative, even/odd, and compare first and last array elements
import java.util.Scanner;

class LevelTwoProblem9 {

    // Method to check whether the number is positive or negative
    // Returns true if positive, false if negative or zero
    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Method to check whether the number is even or odd
    // Returns true if even, false if odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if number1 > number2, 0 if equal, -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Define array size
        int size = 5;

        // Define integer array of 5 elements
        int[] numbers = new int[size];

        // Take user input for 5 numbers
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Loop through array and check each number using methods
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                // Call isEven() for positive numbers
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative.");
            } else {
                System.out.println(numbers[i] + " is Zero.");
            }
        }

        // Compare the first and last elements using compare() method
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.println("\nComparison of First (" + numbers[0] + ") and Last (" + numbers[numbers.length - 1] + "):");
        if (comparisonResult == 1) {
            System.out.println("First element is Greater than Last element.");
        } else if (comparisonResult == 0) {
            System.out.println("First element is Equal to Last element.");
        } else {
            System.out.println("First element is Less than Last element.");
        }

        // Close Scanner
        input.close();
    }
}
