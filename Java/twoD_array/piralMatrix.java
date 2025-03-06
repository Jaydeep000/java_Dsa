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

    // ✅ Function to print matrix in Spiral Order
    public static void spiralMat(int[][] matrix) {
        int startRow = 0, startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        System.out.println("Spiral Order:");
        while(startRow<=endRow && startCol<=endCol){
            7
        }
       
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
