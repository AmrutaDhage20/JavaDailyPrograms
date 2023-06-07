package SixthJune;

public class MatrixAddition {

    public static void main(String args[]) {

        int firstMatrix[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int secondMatrix[][] = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};

        int sumOfMatrices[][] = new int[3][3];

        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                //Addition of matrices
                sumOfMatrices[rowIndex][columnIndex] = firstMatrix[rowIndex][columnIndex] + secondMatrix[rowIndex][columnIndex];
                System.out.print(sumOfMatrices[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
    }
}