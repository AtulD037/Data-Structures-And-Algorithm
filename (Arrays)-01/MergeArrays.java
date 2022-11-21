import java.util.Arrays;

// Merge Two Sorted Arrays into Third One
public class MergeArrays {
    public static void mergeTwoArrays(int[] array_1, int[] array_2){

        // Take length of the arrays
        int k1 = array_1.length;
        int k2 = array_2.length;

        // And make a new array of length having sum of length of both the previous arrays
        int[] merged_array = new int[k1+k2];

        // Apply logic
        int i = 0; // For traversal of array_1
        int j = 0; // For traversal of array_2
        int k = 0; // For traversal of merged array

        while (i<k1 && j<k2){
            if(array_1[i]<array_2[j]){
                merged_array[k] = array_1[i];
                k++;i++;
            }
            else {
                merged_array[k] = array_2[j];
                k++;j++;
            }
        }

        while (i<k1){
            merged_array[k++]=array_1[i++];
        }
        while (j<k2){
            merged_array[k++]=array_2[j++];
        }

        System.out.println(Arrays.toString(merged_array));
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};

        mergeTwoArrays(arr1,arr2);

    }
}
