package LinearSearch;

public class LinearSearchForMinimumNumber {

    static void minNumber(int[] arr){
        int minimumNumber = arr[0];

        for (int a = 0; a < arr.length; a++) {
            if (arr[a]<minimumNumber){
                minimumNumber = arr[a];
            }
        }
        System.out.println(minimumNumber);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,0};
        int[] arr1 = {1,2,3,4,5,6,7,0,-1,-67};
        minNumber(arr);
        minNumber(arr1);
    }

}
