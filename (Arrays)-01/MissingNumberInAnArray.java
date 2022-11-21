public class MissingNumberInAnArray {


    // Using Mathematical Formula

    public static void missingNo(int[] array){
        int N= array[array.length-1];
        int all_sum = (N*(N+1))/2;

        System.out.println(all_sum);

        int n = array.length;
        int sum=0;
        for (int i = 0; i <n; i++) {
            sum+=array[i];
        }
        System.out.println(sum);

        int missing_number = all_sum-sum;
        System.out.println(missing_number);
    }
    // Using XOR (same_element xor same_element -> 0)
    public static int missNo(int[] array){

        int n = array.length;

        int x1 = array[0];
        int x2 = 1;

        // XOR of all elements present in the array
        for (int i = 1; i < n; i++) {
            x1=x1^array[i];
        }

        // XOR of all elements in range 1 to n+1
        for (int i = 2; i <= n+1; i++) {
            x2=x2^i;
        }

        return (x1^x2);


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9,10};
            missingNo(arr);
        System.out.println(missNo(arr));
    }


}
