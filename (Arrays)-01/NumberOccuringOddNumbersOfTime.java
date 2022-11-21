public class NumberOccuringOddNumbersOfTime {

    // Using Brute force
    static int getOddOccurrence(int arr[])
    {
        int arr_size = arr.length;
        for (int i = 0; i < arr_size; i++) {
            int count = 0;
            for (int j = 0; j < arr_size; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }

    // using XOR Operation

    static int getOddOccur(int[] array){
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res=res^array[i];
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };

        System.out.println(getOddOccurrence(arr));
        System.out.println(getOddOccur(arr));

    }
}
