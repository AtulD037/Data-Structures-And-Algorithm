import java.util.Arrays;

public class ZigZag {
    public static void zz(int[] array){

        // Flag true indicates relation "<" is expected,
        // else ">" is expected

        boolean flag = true;

        int temp = 0;

        for (int i = 0; i < array.length-1; i++) {
            if (flag){
                // If we have situation like A>B>C then we can make it A>C<B by swapping B and C
                if (array[i]>array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
            else{
                // If we have situation like A<B<C we can make it A<B>C by swapping B and C
                if (array[i]<array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
            flag=!flag;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };
        zz(arr);
    }
}
