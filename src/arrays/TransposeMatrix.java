package arrays;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Taking input for matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] transpose = new int[cols][rows];

        // Transposing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // Printing the transpose
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
