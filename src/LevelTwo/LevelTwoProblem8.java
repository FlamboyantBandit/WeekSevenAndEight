// Program to find the youngest and tallest among Amar, Akbar, and Anthony using methods
import java.util.Scanner;

class LevelTwoProblem8 {

    // Method to find the youngest friend (minimum age)
    // Returns the index of the youngest friend
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find the tallest friend (maximum height)
    // Returns the index of the tallest friend
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Define friend names
        String[] names = {"Amar", "Akbar", "Anthony"};
        int totalFriends = names.length;

        // Arrays to store age and height of the 3 friends
        int[] ages = new int[totalFriends];
        double[] heights = new double[totalFriends];

        // Take user input for age and height of each friend
        for (int i = 0; i < totalFriends; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Call methods to find youngest and tallest
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Youngest: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest:  " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        // Close Scanner
        input.close();
    }
}
