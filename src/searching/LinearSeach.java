package First.src.searching;

import java.util.Scanner;

public class LinearSeach {

    static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static int LinearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static void TakeInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array");
        int n= sc.nextInt();
        int[] arr= new int[n];

        TakeInput(arr,sc);

        System.out.print("Array");
        print(arr);

        System.out.println("Enter the Value to search:");
        int x= sc.nextInt();
        int index=LinearSearch(arr,x);

        if(index!=-1)
            System.out.println(x+"found at index"+index);
        else
            System.out.println(x+"Not Found In Array");
    }
}
