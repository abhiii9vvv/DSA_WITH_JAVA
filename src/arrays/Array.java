package First.src.arrays;

import java.util.Scanner;

public class Array {

    // Function to print 2D array
    public static void multiArrayPrint() {
        int[][] arr1 = {{1, 2}, {3, 4}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to print array using for-each loop
    public static void printSimpleArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 99};
        for (int num : arr) {
            System.out.print(num + "-");
        }
        System.out.println();
    }

    // Function to calculate sum of array elements
    public static void sumArray() {
        int[] arr = {1, 5, 3};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
    }

    // Function to find max value in array
    public static void findMax() {
        int[] arr = {1, 5, 3};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("MAX Value: " + max);
    }

    // Function to check if element is present in array
    public static int isPresent(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Function to take array input from user
    public static void TakeInput(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    // Function to print array
    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to count occurrences of a number
    public static int CountOccur(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    // Function to find last occurrence of a number
    public static int LastOccur(int[] arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
            }
        }
        return index;
    }

    // Function to count numbers greater than x
    public static int Greater(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    static boolean isSorted (int[] arr){
        boolean check=true;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;

    }

    static int[] MinAndMax(int[] arr){
        int max=arr[0];
        int min=arr[0];

        for(int i=1;i<arr.length;i++) {
            if (arr[i]<min) min=arr[i];
            if (arr[i]>max) max=arr[i];
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] arr3 = {1, 2, 1, 3, 2, 1, 2, 1, 1, 1, 1, 1, 6, 3, 5};
        int[] arr4={3,5,1,7,2,0,-1,55};
        int[] arr5={1,2,3,4,5};

        int[] result = MinAndMax(arr4);
        System.out.println("Min: " + result[0] + ", Max: " + result[1]);

        System.out.println("Is Sorted??? --> "+ isSorted(arr5));

//        System.out.println("Array elements:");
//        Print(arr3);
//
//        System.out.println("Count of 1 in arr3: " + CountOccur(arr3, 1));
//        System.out.println("Last Occurrence of 6: " + LastOccur(arr3, 6));
//        System.out.println("Elements greater than 2: " + Greater(arr4, 3));
//        System.out.println("Is arr3 Sorted?: " + (SortedArray(arr3) == 1 ? "Yes" : "No"));

        // Uncomment below to test optional functions:
        // multiArrayPrint();
        // printSimpleArray();
        // sumArray();
        // findMax();
        // int x = 5;
        // System.out.println("Is Present (Index): " + isPresent(arr3, x));
    }
}
