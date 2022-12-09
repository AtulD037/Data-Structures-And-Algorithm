package BinarySearch;

public class BinarySearchMountain {

    static int peakMountainIndex(int[] array){
        int start = 0;
        int end = array.length-1;

        while (start<end){
          int mid = start+(end-start)/2;

          if (array[mid]>array[mid+1]){
              // You are in decreasing part of the array
              // This may be the answer, but look at left
              // This is why end!= mid -1
              end = mid;
          }
          else {
              // You are ascending part of array
              start = mid+1; // Because we know that mid+1 is greater the mid element
          }
          // in the end start = end and pointing the largest Number because of two
        }
        return start;// or return end as both are equal
    }

    public static void main(String[] args) {

    }

}
