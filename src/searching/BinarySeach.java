package First.src.searching;

public class BinarySeach {
    static int binarySearch(int[] arr,int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        int target=7;

        int result=binarySearch(arr,target);
        System.out.println(result!=-1 ? "Found At Index-> " + result: "NOT FOUND");
    }
}
