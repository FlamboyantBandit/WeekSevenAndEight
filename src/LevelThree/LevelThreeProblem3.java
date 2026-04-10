// NumberChecker utility class - sum of digits, sum of squares, harshad number, digit frequency
import java.util.Scanner;

class LevelThreeProblem3 {

    // Static method to find the count of digits in a number
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Static method to store the digits of the number in a digits array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Static method to find the sum of the digits using the digits array
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    // Static method to find the sum of squares of the digits using Math.pow()
    public static double findSumOfSquaresOfDigits(int[] digits) {
        double sumOfSquares = 0;
        for (int i = 0; i < digits.length; i++) {
            sumOfSquares += Math.pow(digits[i], 2);
        }
        return sumOfSquares;
    }

    // Static method to check if a number is a Harshad number
    // A Harshad number is divisible by the sum of its digits
    public static boolean isHarshadNumber(int number, int[] digits) {
        int digitSum = findSumOfDigits(digits);
        return digitSum != 0 && number % digitSum == 0;
    }

    // Static method to find the frequency of each digit
    // Returns a 2D array: column 0 = digit, column 1 = frequency
    public static int[][] findDigitFrequency(int[] digits) {
        // Frequency array for digits 0-9
        int[] freq = new int[10];
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // Count how many digits have non-zero frequency
        int uniqueCount = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) uniqueCount++;
        }

        // Build 2D array: [digit, frequency]
        int[][] frequency2D = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                frequency2D[index][0] = i;       // digit
                frequency2D[index][1] = freq[i]; // frequency
                index++;
            }
        }
        return frequency2D;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.err.println("Invalid input. Please enter a non-negative number.");
            System.exit(0);
        }

        // Get digits array
        int[] digits = getDigits(number);

        // Display results
        System.out.println("\nDigit Count       : " + countDigits(number));
        System.out.println("Sum of Digits     : " + findSumOfDigits(digits));
        System.out.println("Sum of Squares    : " + findSumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number : " + isHarshadNumber(number, digits));

        // Display digit frequency from 2D array
        int[][] freq = findDigitFrequency(digits);
        System.out.println("\nDigit Frequency:");
        System.out.printf("  %-8s %-10s%n", "Digit", "Frequency");
        for (int i = 0; i < freq.length; i++) {
            System.out.printf("  %-8d %-10d%n", freq[i][0], freq[i][1]);
        }

        // Close Scanner
        input.close();
    }
}
