package arrays;

public class SecondLargest {
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    static int findSecondMax(int[] arr) {
        int mx = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 5, 15};
        System.out.println("Second largest: " + findSecondMax(arr));
    }


}
