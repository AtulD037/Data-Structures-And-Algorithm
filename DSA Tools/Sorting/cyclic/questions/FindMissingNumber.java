package Sorting.cyclic.questions;


//Given an array of numbers containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.
// https://leetcode.com/problems/missing-number/
public class FindMissingNumber {

    public static int missingNumber(int[] nums){
        int i = 0;
        while (i!=nums.length){
            int correct = nums[i];
            if (nums[i]<nums.length&&nums[i]!= nums[correct]){
                swap(nums,i, correct);
            }
            else {
                i++;
            }
        }
        // Search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }
    public static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,3,4,5};
        System.out.println(missingNumber(nums));
    }

}
