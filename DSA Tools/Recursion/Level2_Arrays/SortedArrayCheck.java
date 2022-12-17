package Recursion.Level2_Arrays;

public class SortedArrayCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sortedCheck(arr,0));
    }
    static boolean sortedCheck(int[] arr,int index){
        // base condition
        if (index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sortedCheck(arr,index+1);
    }

}
