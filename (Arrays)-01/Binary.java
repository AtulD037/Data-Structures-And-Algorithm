// Binary Search Algorithm
public class Binary {
    public static int binarySearch(int[] array,int key){
        int first = 0;
        int last = array.length;
        int mid = (first+last)/2;

        while (first<=last){
            if (key==array[mid])
                return mid;
            else if (key<array[mid]) {
                last = mid-1;
            }
            else
                first = mid+1;
            mid = (first+last)/2;
        }
       return mid;
    }

    public static void main(String[] args) {
        int[] arr2 = {2,4,6,8,10};
        System.out.println(binarySearch(arr2,8));
    }
}
