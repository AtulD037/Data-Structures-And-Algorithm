import java.util.Arrays;

public class TwoSumBruteForce {
    static void twoSum(int[] nums,int target){

        for (int i = 0; i < nums.length; i++) {
            int[] ans = new int[2];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    ans[0] = i;
                    ans[1] = j;
                    System.out.println(Arrays.toString(ans));
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 6, 2,1,0,7};
        int target = 7;
        twoSum(nums, target);

    }
}
