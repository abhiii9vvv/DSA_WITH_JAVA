package First.src.basics;

public class EvenOddSeparator {
    static void swapInArray(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    static void print(int[] nums){
        for(int num:nums){
            System.out.print(num);
        }
    }

    static void separateEvenOdd(int[] arr){
        int left=0,right=arr.length-1;

        while (left<right){
            if(arr[left]%2==0){
                left++;
            }if(arr[right]%2!=0){
                right--;
            }if(arr[left]%2!=0 && arr[right]%2==0){
                swapInArray(arr,left,right);
                left++;
                right--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 2, 6, 1};
        System.out.println("BEFORE");
        print(arr);

        System.out.println();

        separateEvenOdd(arr);
        System.out.println("AFTER");
        print(arr);
    }
}
