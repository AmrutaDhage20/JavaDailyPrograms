package SixthJune;

public class MatrixAddition {

    public static void main(String args[]) {
        int firstMatrix[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int secondMatrix[][] = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};

        int sumOfMatrices[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumOfMatrices[i][j] = firstMatrix[i][j] + secondMatrix[i][j];  //use - for subtraction
                System.out.print(sumOfMatrices[i][j] + " ");
            }
            System.out.println();//new line
        }
    }
}