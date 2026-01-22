package arrays;

public class productArray {


    public static double productArr(int arr[]){
        int product=1;
        for(int i=0;i<arr.length;i++){
            product*=arr[i];

        }
        return product;
    }



    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        double result= productArr(arr);
        System.out.println(result);


    }
}
