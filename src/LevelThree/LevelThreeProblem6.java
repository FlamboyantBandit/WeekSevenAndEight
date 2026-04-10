// NumberChecker utility class - perfect, abundant, deficient, strong number checks
import java.util.Scanner;

class LevelThreeProblem6 {

    // Helper: get sum of proper divisors (all divisors excluding the number itself)
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum;
    }

    // Helper: compute factorial of a digit
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Static method to check if a number is a perfect number
    // Perfect: sum of proper divisors equals the number
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) return false;
        return sumOfProperDivisors(number) == number;
    }

    // Static method to check if a number is an abundant number
    // Abundant: sum of proper divisors is greater than the number
    public static boolean isAbundantNumber(int number) {
        if (number <= 1) return false;
        return sumOfProperDivisors(number) > number;
    }

    // Static method to check if a number is a deficient number
    // Deficient: sum of proper divisors is less than the number
    public static boolean isDeficientNumber(int number) {
        if (number <= 1) return true;
        return sumOfProperDivisors(number) < number;
    }

    // Static method to check if a number is a strong number
    // Strong: sum of factorials of digits equals the number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        long factorialSum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            factorialSum += factorial(digit);
            temp /= 10;
        }
        return factorialSum == number;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a positive integer.");
            System.exit(0);
        }

        // Display results
        System.out.println("\n--- Number Checker Results for " + number + " ---");
        System.out.println("Sum of Proper Divisors : " + sumOfProperDivisors(number));
        System.out.println("Is Perfect Number      : " + isPerfectNumber(number));
        System.out.println("Is Abundant Number     : " + isAbundantNumber(number));
        System.out.println("Is Deficient Number    : " + isDeficientNumber(number));
        System.out.println("Is Strong Number       : " + isStrongNumber(number));

        // Close Scanner
        input.close();
    }
}
