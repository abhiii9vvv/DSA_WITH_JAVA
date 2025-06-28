package First.src.prefixsum;

public class SubArray {
    static void CanPartition(int[] arr){
        int sum=0;
        for(int num:arr) sum+=num;

        int prefixSum=0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum+=arr[i];
            if (prefixSum==sum-prefixSum){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("Noo");
    }

    public static void main(String[] args) {
        int arr[] ={5,3,2,6,3,1};
        CanPartition(arr);
    }
}