// Find the largest element in an array

public class LargestInArray {
    public static int largestElement(int[] array){
        int n = array.length;
        int largest = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i]>largest){
                largest=array[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] array = {1,3,45,456,257};
        System.out.println(largestElement(array));
    }
}
