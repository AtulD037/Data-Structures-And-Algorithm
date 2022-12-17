package Sorting;

import java.util.Arrays;

public class Bubble {

    public static int[] bubbleSort(int[] arr){
        // Run the steps of bubble sort
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] arr2 = {-90,-111,7,0,56,2};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(bubbleSort(arr2)));

    }


}
