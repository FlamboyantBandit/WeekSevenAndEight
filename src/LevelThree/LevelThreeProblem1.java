// Program to find shortest, tallest, and mean height of a football team using random heights
class LevelThreeProblem1 {

    // Method to find the sum of all elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find the shortest height among the players
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    // Method to find the tallest height among the players
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Define team size and height range (150cm to 250cm)
        int teamSize = 11;
        int minHeight = 150;
        int heightRange = 101; // 150 to 250 inclusive

        // Create int array named heights of size 11
        int[] heights = new int[teamSize];

        // Generate 3-digit random heights in range 150 to 250 cms for each player
        System.out.println("Generated Heights for Football Team Players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * heightRange) + minHeight;
            System.out.println("  Player " + (i + 1) + ": " + heights[i] + " cm");
        }

        // Call methods and display the results
        System.out.println("\n--- Football Team Height Report ---");
        System.out.println("Shortest Player Height : " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest Player Height  : " + findTallestHeight(heights) + " cm");
        System.out.printf("Mean Height            : %.2f cm%n", findMeanHeight(heights));
    }
}
