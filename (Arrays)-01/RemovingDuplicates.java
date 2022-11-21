// Remove Duplicates from a sorted array

import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDuplicates {



            // // // // // // // // Using Extra Spaces // // // // // // // // // //
    public static int removeDuplicates(int[] arr){
        int n=arr.length;

        // Return if array is empty or a singleton element
        if (n==0||n==1)
            return n;

        int[] temp = new int[n];

        // Start Transversing the element
        int j = 0;
        for (int i = 0; i < n-1; i++) {

            // If next element is not equal store then store the current element
            if (arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j++]=arr[n-1];

        // Modify original array
        for (int i = 0; i < j; i++) {
            arr[i]=temp[i];
        }
        return j;
    }



    // // // // // // // // Using Hashset // // // // // // // // // //

    public static void removeDupsUsingHashset(int[] array){
        ArrayList<Integer> numberlist = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            numberlist.add(array[i]);
        }
        System.out.println(numberlist);

        HashSet<Integer> hashSet = new HashSet<>(numberlist);
        System.out.println(hashSet);
     }



    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };

//        n = removeDuplicates(arr);
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//        }
        removeDupsUsingHashset(arr);
    }

}