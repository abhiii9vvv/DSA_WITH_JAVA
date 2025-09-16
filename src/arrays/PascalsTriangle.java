package arrays;

import java.util.Scanner;

public class PascalsTriangle {
    public static void print2DArray(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            // Print leading spaces for alignment
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print("  ");
            }
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "   ");  // More spacing between numbers
            }
            System.out.println();
        }
    }


    static int[][] pascal(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        int[][] ans = pascal(n);
        print2DArray(ans);
    }
}
