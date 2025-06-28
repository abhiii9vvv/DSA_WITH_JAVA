package First.src.basics;

public class FirstRepeatingElement {
    public int findFirstRepeating(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstRepeatingElement obj = new FirstRepeatingElement();
        int[] arr = {1, 5, 3, 4, 6, 3, 4};
        System.out.println("First Repeating Element: " + obj.findFirstRepeating(arr));

    }
}
