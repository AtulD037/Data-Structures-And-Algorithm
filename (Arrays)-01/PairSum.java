import java.util.Arrays;

// Pairs with sum in an array
public class PairSum {

    public static void sumPair(int[] array, int givenSum){
            Arrays.sort(array);

            int lo = 0;
            int high = array.length-1;

            while (lo<high){
                if(array[lo]+array[high]>givenSum){
                    high--;
                }
                else if(array[lo]+array[high]<givenSum){
                    lo++;
                }
                else System.out.println("Pair is : ("+ array[lo]+"," +array[high]+")");lo++;
            }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int sum = 11;

        sumPair(array,sum);
    }

}
