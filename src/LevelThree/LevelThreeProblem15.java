// Program to find transpose, determinant, and inverse of matrices
class LevelThreeProblem15 {

    // Method to create a random matrix with values 1-9
    public static int[][] createRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
        return matrix;
    }

    // Method to display an integer matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%8d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Method to display a double matrix
    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%10.4f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Method to find the transpose of a matrix
    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    // det = ad - bc
    public static int findDeterminant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix using cofactor expansion
    public static int findDeterminant3x3(int[][] matrix) {
        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[0][2];

        // Cofactors of the first row
        int cofactorA = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        int cofactorB = matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0];
        int cofactorC = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];

        return a * cofactorA - b * cofactorB + c * cofactorC;
    }

    // Method to find the inverse of a 2x2 matrix
    // Inverse = (1/det) * [[d, -b], [-c, a]]
    public static double[][] findInverse2x2(int[][] matrix) {
        int det = findDeterminant2x2(matrix);
        if (det == 0) {
            System.out.println("Inverse does not exist (determinant is 0).");
            return new double[0][0];
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] =  matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] =  matrix[0][0] / (double) det;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix using the adjugate method
    public static double[][] findInverse3x3(int[][] m) {
        int det = findDeterminant3x3(m);
        if (det == 0) {
            System.out.println("Inverse does not exist (determinant is 0).");
            return new double[0][0];
        }

        // Compute the matrix of cofactors
        double[][] inverse = new double[3][3];
        inverse[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double) det;
        inverse[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / (double) det;
        inverse[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double) det;
        inverse[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / (double) det;
        inverse[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double) det;
        inverse[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / (double) det;
        inverse[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double) det;
        inverse[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / (double) det;
        inverse[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double) det;
        return inverse;
    }

    public static void main(String[] args) {
        // --- 2x2 Matrix operations ---
        System.out.println("=== 2x2 Matrix Operations ===");
        int[][] matrix2x2 = createRandomMatrix(2, 2);
        System.out.println("\nOriginal 2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("\nTranspose:");
        displayMatrix(findTranspose(matrix2x2));

        System.out.println("\nDeterminant: " + findDeterminant2x2(matrix2x2));

        System.out.println("\nInverse:");
        double[][] inv2x2 = findInverse2x2(matrix2x2);
        if (inv2x2.length > 0) displayMatrix(inv2x2);

        // --- 3x3 Matrix operations ---
        System.out.println("\n=== 3x3 Matrix Operations ===");
        int[][] matrix3x3 = createRandomMatrix(3, 3);
        System.out.println("\nOriginal 3x3 Matrix:");
        displayMatrix(matrix3x3);

        System.out.println("\nTranspose:");
        displayMatrix(findTranspose(matrix3x3));

        System.out.println("\nDeterminant: " + findDeterminant3x3(matrix3x3));

        System.out.println("\nInverse:");
        double[][] inv3x3 = findInverse3x3(matrix3x3);
        if (inv3x3.length > 0) displayMatrix(inv3x3);
    }
}
