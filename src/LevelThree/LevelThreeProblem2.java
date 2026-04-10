// NumberChecker utility class - duck number, armstrong number, largest/smallest digits
import java.util.Scanner;

class LevelThreeProblem2 {

    // Static method to find the count of digits in a number
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        if (temp == 0) return 1;
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

    // Static method to check if a number is a duck number
    // A duck number has at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }

    // Static method to check if a number is an Armstrong number
    // Armstrong: sum of digits^(number of digits) equals the number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        double sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], power);
        }
        return (int) sum == number;
    }

    // Static method to find the largest and second largest elements in the digits array
    // Returns [largest, secondLargest]
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Static method to find the smallest and second smallest elements in the digits array
    // Returns [smallest, secondSmallest]
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[]{smallest, secondSmallest};
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

        // Display digit count and digits
        System.out.println("\nNumber of Digits : " + countDigits(number));
        System.out.print("Digits           : ");
        for (int d : digits) System.out.print(d + " ");

        // Check duck number
        System.out.println("\nIs Duck Number   : " + isDuckNumber(digits));

        // Check Armstrong number
        System.out.println("Is Armstrong     : " + isArmstrongNumber(number, digits));

        // Find largest and second largest
        int[] largestPair = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit    : " + largestPair[0]);
        System.out.println("2nd Largest Digit: " + largestPair[1]);

        // Find smallest and second smallest
        int[] smallestPair = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit   : " + smallestPair[0]);
        System.out.println("2nd Smallest Digit: " + smallestPair[1]);

        // Close Scanner
        input.close();
    }
}
