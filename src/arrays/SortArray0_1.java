package arrays;

public class SortArray0_1 {

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


    static void sort(int[] nums){
        int n=nums.length;
        int zeroes=0;//zeroes count
        for (int i = 0; i < n; i++) {
            if(nums[i]==0){
                zeroes++;
            }
        }


        for (int i = 0; i < n; i++) {
            if(i<zeroes){
                nums[i]=0;
            }else {
                nums[i]=1;
            }
        }
        //0 to zeroes-1: zeroes to n-1: 1
    }

    static void Advancesort(int[] nums){
        int left=0,right=nums.length-1;

        while (left<right){
            if (nums[left]==1 && nums[right]==0){
                swapInArray(nums,left,right);
                left++;
                right--;
            }
            if(nums[left]==0){
                left++;
            }
            if(nums[right]==1){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,0,1,0,1,0,1};
//        sort(arr);
        Advancesort(arr);
        print(arr);
    }
}
