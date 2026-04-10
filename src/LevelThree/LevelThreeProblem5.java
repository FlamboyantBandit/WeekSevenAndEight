// NumberChecker utility class - prime, neon, spy, automorphic, buzz number checks
import java.util.Scanner;

class LevelThreeProblem5 {

    // Helper: count digits
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0, temp = number;
        while (temp > 0) { count++; temp /= 10; }
        return count;
    }

    // Helper: get digits array
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

    // Static method to check if a number is a prime number
    // A prime number is greater than 1 and has no divisors other than 1 and itself
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Static method to check if a number is a neon number
    // A neon number: sum of digits of its square equals the number itself
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int[] squareDigits = getDigits(square);
        int digitSum = 0;
        for (int d : squareDigits) digitSum += d;
        return digitSum == number;
    }

    // Static method to check if a number is a spy number
    // A spy number: sum of digits equals product of digits
    public static boolean isSpyNumber(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        int product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    // Static method to check if a number is an automorphic number
    // Automorphic: the square of the number ends with the number itself
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int digits = countDigits(number);
        int divisor = (int) Math.pow(10, digits);
        return square % divisor == number;
    }

    // Static method to check if a number is a buzz number
    // A buzz number is divisible by 7 or ends with 7
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
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

        // Display results
        System.out.println("\n--- Number Checker Results for " + number + " ---");
        System.out.println("Is Prime       : " + isPrime(number));
        System.out.println("Is Neon        : " + isNeonNumber(number));
        System.out.println("Is Spy         : " + isSpyNumber(number));
        System.out.println("Is Automorphic : " + isAutomorphicNumber(number));
        System.out.println("Is Buzz        : " + isBuzzNumber(number));

        // Close Scanner
        input.close();
    }
}
