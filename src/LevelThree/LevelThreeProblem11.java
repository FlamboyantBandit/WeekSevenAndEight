// Program to calculate bonus for 10 Zara employees using random salary/service data and methods
class LevelThreeProblem11 {

    // Define constants
    static int totalEmployees = 10;
    static double bonusRateHigh = 0.05;  // 5% for more than 5 years
    static double bonusRateLow  = 0.02;  // 2% for 5 years or less
    static int serviceThreshold = 5;

    // Method to generate random salary and years of service for 10 employees
    // Returns 2D array: column 0 = salary, column 1 = years of service
    public static double[][] generateEmployeeData() {
        double[][] employeeData = new double[totalEmployees][2];
        for (int i = 0; i < totalEmployees; i++) {
            // Random 5-digit salary: 10000 to 99999
            employeeData[i][0] = (int) (Math.random() * 90000) + 10000;
            // Random years of service: 1 to 10 years
            employeeData[i][1] = (int) (Math.random() * 10) + 1;
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus based on years of service
    // Returns 2D array: column 0 = new salary, column 1 = bonus amount
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] result = new double[totalEmployees][2];
        for (int i = 0; i < totalEmployees; i++) {
            double salary = employeeData[i][0];
            double years  = employeeData[i][1];

            // Determine bonus based on years of service
            double bonus = (years > serviceThreshold)
                    ? salary * bonusRateHigh
                    : salary * bonusRateLow;

            result[i][0] = salary + bonus;  // new salary
            result[i][1] = bonus;           // bonus amount
        }
        return result;
    }

    // Method to calculate totals and display in tabular format
    public static void displaySalaryReport(double[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus     = 0;

        System.out.printf("%-10s %-14s %-18s %-12s %-14s%n",
                "Employee", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("-".repeat(70));

        for (int i = 0; i < totalEmployees; i++) {
            double oldSalary = employeeData[i][0];
            double years     = employeeData[i][1];
            double bonus     = bonusData[i][1];
            double newSalary = bonusData[i][0];

            System.out.printf("%-10d %-14.2f %-18.0f %-12.2f %-14.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus     += bonus;
        }

        System.out.println("-".repeat(70));
        System.out.printf("%-10s %-14.2f %-18s %-12.2f %-14.2f%n",
                "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        // Generate random employee data using method
        double[][] employeeData = generateEmployeeData();

        // Calculate new salary and bonus using method
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);

        // Display the full report using method
        System.out.println("=== Zara Employee Bonus Report ===\n");
        displaySalaryReport(employeeData, bonusData);
    }
}
