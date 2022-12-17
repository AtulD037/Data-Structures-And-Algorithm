package BinarySearch;

public class BinarySearchFindElementInAnInfiniteArray {

    static int ans(int[] array,int target){
        // First find the target within first two elements
        int start = 0;
        int end  = 1;

        // Condition for a target to lie in the range
        while (target>array[end]){
            int temp = end+1;
            end = end+(end-start+1)*2;
            start = temp;
        }
        return binarySearch(array,target,start,end);
    }

    static int binarySearch(int[] array,int target,int start,int end){
        while (start<=end){
            // Find the middle element
            int mid = start+(end-start)/2; // Better way

            if (target<array[mid]){
                end = mid-1;
            } else if (target>array[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3,5,7,9,10,90,100,130,140,160,170};
        System.out.println(ans(array,100));
    }

}
