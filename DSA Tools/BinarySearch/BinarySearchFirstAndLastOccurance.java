package BinarySearch;

import java.util.Arrays;

public class BinarySearchFirstAndLastOccurance {

    // First Binary Loop to Actually Find if element is present

    static int[] searchRange(int[] nums,int target){
       int[] ans = {-1,-1,};
       int first = search(nums,target,true);
       int last = search(nums,target,false);
       ans[0] = first;
       ans[1] = last;

       return ans;
    }

    // This function return index value of what we are trying to do

    static int search(int[] nums,int target, boolean firstStartIndex){
        int start = 0;
        int end = nums.length-1;

        int ans = -1;
        while (start<=end){

            int mid = start+(end-start)/2;
            if (target>nums[mid]){
                start = mid+1;
            } else if (target<nums[mid]) {
                end=mid-1;
            }
            else {
                ans=mid;
                if (firstStartIndex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {5,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(array,7)));
    }
}
