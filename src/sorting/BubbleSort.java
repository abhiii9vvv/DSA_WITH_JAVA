package First.src.sorting;

public class BubbleSort {
    static void Sort(int[] arr){
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j =0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,2};
        Sort(arr);

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
