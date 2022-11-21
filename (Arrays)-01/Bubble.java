import java.util.Arrays;

public class Bubble {

    // Bubble Sort Logic
    public static void bubbleSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] array = {2, 8, 1, 3, 6, 7, 5, 4};
        bubbleSort(array);
    }
}
