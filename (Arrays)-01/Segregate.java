import java.util.Arrays;

//segregate 0 1 and 2
public class Segregate {

    public static void segregateUsingCounter(int[] array){
        int n = array.length;
        int count = 0;

        // Count the number of zeroes

        for (int i = 0; i < n; i++) {
            if (array[i]==0){
                count++;
            }
        }
        // Make values zero until count
        for (int i = 0; i < count; i++) {
            array[i]=0;
        }

        // After count assign value 1

        for (int i = count; i < n; i++) {
            array[i] =1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void segregateUdingDNFAlgo(int[] array){
        int low = 0;
        int high = array.length-1;
        int mid = 0;
        int temp = 0;

        while (mid<=high){
            switch (array[mid]){
                // If element is zero then swap the minimum index
                case 0:
                    temp = array[low];
                    array[low] = array[mid];
                    array[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = array[high];
                    array[high] = array[mid];
                    array[mid] = temp;
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(array));

    }
     public static void main(String[] args) {
         int[] arr = new int[]{ 0, 1, 0, 1, 1, 1 };
         segregateUsingCounter(arr);

         int[] array = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
         segregateUdingDNFAlgo(array);
     }

}
