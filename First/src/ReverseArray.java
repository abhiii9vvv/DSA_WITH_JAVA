package First.src;

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

    static void print(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] reversed=reverse(arr);
        print(reversed);
    }
}
