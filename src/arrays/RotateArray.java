package First.src.arrays;

public class RotateArray {

    static void reverse(int[] array,int start,int end){
        while (start<end){
            int temp=array[start];
            array[start++]=array[end];
            array[end--]=temp;
        }
    }
    static void rotate(int[] array,int k){
        int length=array.length;
        k=k%length;

        reverse(array,0,length-k-1);
        reverse(array,length-k,length-1);
        reverse(array,0,length-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int steps = 3;
        rotate(arr, steps);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
