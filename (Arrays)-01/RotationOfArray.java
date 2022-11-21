// Rotation Of array using Reversal algorithm

import java.util.Arrays;

public class RotationOfArray {

    static void rotate(int arr[], int r){
        if (r==0){
            return;
        }

        int n = arr.length;

        // Divide array into two parts - one is (0 to n-r-1) and second from(n-r to n)

        // Reverse the first part of Array
        reverseArray(arr,0,n-r-1);
        System.out.println(Arrays.toString(arr));

        // Reverse Second Part of Array
        reverseArray(arr,n-r,n-1);
        System.out.println(Arrays.toString(arr));


        // Reverse whole array to get a rotated array
        reverseArray(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        rotate(array,2);
    }

}
