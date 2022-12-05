import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashTable {

    static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> hmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (hmap.containsKey(target-x)){
                return new int[]{hmap.get(target-x)+1,i+1};
            }
            hmap.put(x,i);
        }
        throw new IllegalArgumentException("No two Sum Solution");
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 6, 2,1,0,7};
        int target = 7;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
