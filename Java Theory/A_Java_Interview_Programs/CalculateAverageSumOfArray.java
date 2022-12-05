package A_Java_Interview_Programs;

import java.util.Arrays;
import java.util.OptionalDouble;

public class CalculateAverageSumOfArray {

    static void averageSumUsingLoop(int[] array){
        double sum = 0;
        for (int q = 0; q < array.length; q++) {
            sum+=array[q];
        }
        System.out.println(sum/ array.length);
    }

    static void averageUsingJavaStreams(int[] array){
        OptionalDouble avg = Arrays.stream(array).average();
        System.out.println(avg.getAsDouble());
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        averageSumUsingLoop(arr);
        averageUsingJavaStreams(arr);
    }

}
