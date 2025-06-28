package First.src.prefixsum;

public class prefix_sum_in_place {
    static int[] prefixSum(int[] arr){
        int n=arr.length;

        for (int i = 1; i < n; i++) {
            arr[i]=arr[i-1]+ arr[i];
        }
        return arr;
    }

    static void print(int[] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr={2,1,3,4,5};
        prefixSum(arr);
        print(arr);
    }
}
