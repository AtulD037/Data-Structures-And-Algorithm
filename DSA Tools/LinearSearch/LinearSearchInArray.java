package LinearSearch;

public class LinearSearchInArray {
    public static boolean present(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(present(arr,6));
        System.out.println(present(arr,9));
    }
}
