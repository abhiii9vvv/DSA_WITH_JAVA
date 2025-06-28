package First.src.basics;

public class CheckNonReapted {
    static int checkMulti(int[] nums) {
        int unique = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    unique = nums[i];

                    break;
                }
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 3, 4, 5, 5};
        System.out.println(checkMulti(arr));
    }
}
