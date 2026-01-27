package arrays;

public class BinarySearch {
    public static int binary(int[] arr, int x){
        int start=0;
        int end= arr.length-1;


        while (start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==x){
                return mid;
            }

            if(arr[mid]<x){//right
                start=mid+1;
            }else { //left
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers={5,6,7,8,9,10,11,12,13,14};
        int key=10;
        System.out.println(binary(numbers,key));
    }
}
