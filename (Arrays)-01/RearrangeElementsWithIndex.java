import java.util.Arrays;

// Rearrange elements
public class RearrangeElementsWithIndex
{

    public static void rearrange(int[] array){
        int[] temp = new int[array.length];

        // Store value in temp array 
        for (int i = 0; i < array.length; i++) {
                temp[array[i]]=i;
        }
        
        // Copy them back into original array

        for (int i = 0; i < array.length; i++) {
            array[i]=temp[i];
        }

        System.out.println(Arrays.toString(array));
        
    }

    public static void main(String[] args) {
        int[] arr= { 1, 3, 0, 2 };
        rearrange(arr);
    }

}
