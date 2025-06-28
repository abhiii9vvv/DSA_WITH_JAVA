package First.src.prefixsum;

import java.util.Scanner;

public class range_sum_queries {
    static void print(int[] nums){
        for(int num:nums){
            System.out.print(num);
        }
    }
    static int[] buildPrefixSum(int[] arr){
        int n=arr.length;
        int[] preifx=new int[n+1];
        for (int i = 1; i < n; i++) {
            preifx[i]=preifx[i-1]+arr[i-1];
        }
        return preifx;
    }
    static int rangeSum(int[] prefix,int l,int r){
        return prefix[r]-prefix[l-1];
    }

    public static void main(String[] args) {
        int[] arr={2,4,1,3,6,5,3,2,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the L");
        int l=sc.nextInt();
        System.out.println("Enter the R");
        int r=sc.nextInt();

        int[] prefix=buildPrefixSum(arr);
        int result=rangeSum(prefix,l,r);

        System.out.println(result);

    }
}
