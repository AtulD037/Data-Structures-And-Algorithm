package Recursion.Level2_Arrays;

public class LinearSeachInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int target = 2;
        System.out.println(linearSearch(array,target,0));
    }
    static boolean linearSearch(int[] arr,int target,int index){
        if (index==arr.length){
            return false;
        }
        return arr[index]==target || linearSearch(arr,target,index+1);
    }
}
