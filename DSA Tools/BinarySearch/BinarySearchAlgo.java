package BinarySearch;

public class BinarySearchAlgo {

    static int binarySearch(int[] array,int target){
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
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {-10,-6,2,3,4,15,16,18,22};
        System.out.println(binarySearch(array,-6));
        System.out.println(binarySearch(array,22));
    }

}
