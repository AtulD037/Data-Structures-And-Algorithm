package LinearSearch;

public class LinearSearchInRange {
    // Search for index in particular range

    static void search(int[] arr,int range, int key){
        if (arr.length==0|| arr.length==1){
            System.out.println("Invalid array or have only one element");
        }
        for (int i = 0; i < range; i++) {
            if (arr[i]==key){
                System.out.println("Key is present at position "+arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,63,2,45,6};
        int r = 4;
        int key = 63;
        search(arr,r,key);
    }
}
