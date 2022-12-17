package BinarySearch;

public class BinarySearchFloorOfANumberInArray {
    static int floor(int[] array,int target){
        int start = 0;
        int end = array.length-1;

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
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        System.out.println(floor(arr,target));
    }
}
