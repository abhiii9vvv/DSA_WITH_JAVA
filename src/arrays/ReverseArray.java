package arrays;

public class ReverseArray {
    static int[] reverse(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        int j=0;
        for (int i =n-1; i>=0 ; i--) {
            ans[j++] = nums[i];
        }
        return ans;
    }

    static void swapInArray(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    static void reverseAdvance(int[] nums){
        int i=0,j=nums.length-1;

        while (i<j){
            swapInArray(nums,i,j);
            i++;
            j--;
        }

    }


    static void print(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5};
        int[] arr2={5,4,3,2,1,3};
//        int[] reversed=reverse(arr);
//        print(reversed);
        reverseAdvance(arr2);
        print(arr2);
    }
}