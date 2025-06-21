package First.src;

public class ReverseArray {
    static void reverse(int[] nums){
        for (int i = nums.length; i <0 ; i--) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
    }
}
