package twoD_array;
import java.util.Scanner;

public class piralMatrix {

    // ✅ Function to print matrix
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix is:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

     public static void spiralMat(int[][] mat) {
        int startRow = 0, startCol = 0;
        int endRow = mat.length - 1;
        int endCol = mat[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // left to right
            for (int col = startCol; col <= endCol; col++) {
                System.out.print(mat[startRow][col] + " ");
            }
            startRow++;

            // top to bottom
            for (int row = startRow; row <= endRow; row++) {
                System.out.print(mat[row][endCol] + " ");
            }
            endCol--;

            // right to left
            if (startRow <= endRow) {
                for (int col = endCol; col >= startCol; col--) {
                    System.out.print(mat[endRow][col] + " ");
                }
                endRow--;
            }

            // bottom to top
            if (startCol <= endCol) {
                for (int row = endRow; row >= startRow; row--) {
                    System.out.print(mat[row][startCol] + " ");
                }
                startCol++;
            }
        }
        System.out.println();
    }





    // ✅ Main method for input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        printMatrix(matrix);
        System.out.println();
        spiralMat(matrix);

        scanner.close();
    }
}
