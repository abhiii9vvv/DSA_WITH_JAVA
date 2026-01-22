package arrays;

public class printNegativeNumOnly {

    public static void printNeg(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,65,-1,-63,-58,-284};
        printNeg(arr);
    }
}
