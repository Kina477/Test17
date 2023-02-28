package test.andrijasevic;

public class Test {
    public static void main(String[] args) {
         int[] arr = {1, 2, 3, 4, 5};

         double avg = ArrayOperations.average(arr);
        System.out.println("Середнє арифметичне: " + avg);

         int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

         boolean isSquare = MatrixOperations.isSquare(matrix);
        System.out.println("Чи є матриця квадратною? " + isSquare);
    }
}
