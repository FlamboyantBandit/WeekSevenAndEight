// Program to generate five 4-digit random numbers and find average, min, and max
class LevelTwoProblem12 {

    // Method to generate an array of 4-digit random numbers given size as parameter
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate random 4-digit number: 1000 to 9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find average, min, and max value of an array
    // Returns double array: [average, min, max]
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Create an instance of the class
        LevelTwoProblem12 program = new LevelTwoProblem12();

        // Define the number of random values to generate
        int size = 5;

        // Generate array of five 4-digit random numbers
        int[] randomNumbers = program.generate4DigitRandomArray(size);

        // Display the generated numbers
        System.out.println("Generated 4-digit Random Numbers:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println("  Number " + (i + 1) + ": " + randomNumbers[i]);
        }

        // Find average, min, and max using method
        double[] stats = program.findAverageMinMax(randomNumbers);

        // Display the results
        System.out.printf("%nAverage : %.2f%n", stats[0]);
        System.out.printf("Minimum : %.0f%n", stats[1]);
        System.out.printf("Maximum : %.0f%n", stats[2]);
    }
}
