import java.util.Arrays;

public class CheckingSortedArray {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,78};
        sortCheck(a);
    }
    static void sortCheck(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]> arr[i+1]){
                System.out.println("Not a sorted array");
                break;
            }
        }
        System.out.println("Array "+ Arrays.toString(arr)+ " is sorted");
    }

}
