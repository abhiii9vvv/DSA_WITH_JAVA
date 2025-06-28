package First.src.Pattern;

import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println();

        simpleIncreasingNumberGrid(row, row);
        checkerboardPattern(row, row);
        increasingTriangle(row);
        centeredNumberPyramid(row);
        rotatingNumberPattern(row);
        starPyramid(row);
        invertedRightAngleStar(row);
        rightAngleStar(row);

        sc.close();
    }

    static void simpleIncreasingNumberGrid(int row, int column) {
        System.out.println("1. Simple Grid:");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void checkerboardPattern(int row, int column) {
        System.out.println("2. Checkerboard 1/2 Pattern:");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void increasingTriangle(int row) {
        System.out.println("3. Increasing Triangle:");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void centeredNumberPyramid(int row) {
        System.out.println("4. Centered Number Pyramid:");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void rotatingNumberPattern(int row) {
        System.out.println("5. Rotating Numbers:");
        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print(j);
            }
            for (int k = 1; k < i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
        System.out.println();
    }

    static void starPyramid(int row) {
        System.out.println("6. Star Pyramid:");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void invertedRightAngleStar(int row) {
        System.out.println("7. Inverted Right-Angle Star:");
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void rightAngleStar(int row) {
        System.out.println("8. Right-Angle Star:");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
