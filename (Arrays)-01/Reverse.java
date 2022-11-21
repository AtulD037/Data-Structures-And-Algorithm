import java.util.Arrays;

//Reverse an array without using extra memory spaces
public class Reverse {

    public static void reverseArray(int[] array){
        int lo = 0;
        int hi = array.length-1;

        while (lo<=hi){
            int temp = array[lo];
            array[lo] = array[hi];
            array[hi] = temp;
            lo++;
            hi--;
        }
        System.out.println("Reversed array is : "+Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        reverseArray(array);

    }

}
