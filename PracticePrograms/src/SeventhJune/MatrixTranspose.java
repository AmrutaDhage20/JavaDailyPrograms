package SeventhJune;

public class MatrixTranspose {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transposedMatrix = transposeMatrix(matrix);

        for (int[] row : transposedMatrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[columns][rows];

        for (int index = 0; index < rows; index++) {
            for (int subIndex = 0; subIndex < columns; subIndex++) {
                transposedMatrix[subIndex][index] = matrix[index][subIndex];
            }
        }
        return transposedMatrix;
    }
}