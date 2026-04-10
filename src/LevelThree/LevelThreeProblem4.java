// NumberChecker utility class - reverse digits, compare arrays, palindrome, duck number
import java.util.Scanner;

class LevelThreeProblem4 {

    // Static method to find count of digits
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0, temp = number;
        while (temp > 0) { count++; temp /= 10; }
        return count;
    }

    // Static method to store digits in an array
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

    // Static method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Static method to compare two arrays and check if they are equal
    public static boolean arraysAreEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }

    // Static method to check if a number is a palindrome using digits
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigitsArray(digits);
        return arraysAreEqual(digits, reversed);
    }

    // Static method to check if a number is a duck number
    // A duck number has at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) return true;
        }
        return false;
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

        // Display digits
        System.out.print("\nDigits         : ");
        for (int d : digits) System.out.print(d + " ");

        // Reverse digits array and display
        int[] reversedDigits = reverseDigitsArray(digits);
        System.out.print("\nReversed Digits: ");
        for (int d : reversedDigits) System.out.print(d + " ");

        // Check if arrays are equal
        System.out.println("\nArrays Equal   : " + arraysAreEqual(digits, reversedDigits));

        // Check palindrome
        System.out.println("Is Palindrome  : " + isPalindrome(digits));

        // Check duck number
        System.out.println("Is Duck Number : " + isDuckNumber(digits));

        // Close Scanner
        input.close();
    }
}
