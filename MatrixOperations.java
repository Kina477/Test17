package test.andrijasevic;

public class MatrixOperations {
    public static boolean isSquare(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows != cols) {
            return false;
        }
        for (int i = 1; i < rows; i++) {
            if (matrix[i].length != cols) {
                return false;
            }
        }
        return true;
    }
}
