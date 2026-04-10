// Program to generate a 6-digit OTP and validate uniqueness across 10 generations
class LevelThreeProblem8 {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Range: 100000 to 999999 (6 digits)
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if all OTP numbers in the array are unique
    // Returns true if all OTPs are unique, false if any duplicate exists
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Define the number of OTPs to generate
        int numberOfOTPs = 10;

        // Create an array to save the OTP numbers generated 10 times
        int[] otps = new int[numberOfOTPs];

        // Generate 10 OTP numbers
        System.out.println("Generating " + numberOfOTPs + " OTP numbers:");
        for (int i = 0; i < numberOfOTPs; i++) {
            otps[i] = generateOTP();
            System.out.println("  OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if all OTPs are unique using method
        boolean unique = areOTPsUnique(otps);

        // Display uniqueness result
        System.out.println("\nAll OTPs are unique: " + unique);
        if (!unique) {
            System.out.println("Warning: Duplicate OTPs were found!");
        } else {
            System.out.println("All 10 OTP numbers are different - validation passed.");
        }
    }
}
