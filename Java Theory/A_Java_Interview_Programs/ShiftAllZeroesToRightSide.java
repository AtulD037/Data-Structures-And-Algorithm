package A_Java_Interview_Programs;

import java.util.Arrays;

public class ShiftAllZeroesToRightSide {

    static void shift(int[] array){
        int[] newArray = new int[array.length];

        Arrays.fill(newArray,0);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1){
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            newArray[i]=1;
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,0,1,0,1,0};
        shift(arr);
    }

}
