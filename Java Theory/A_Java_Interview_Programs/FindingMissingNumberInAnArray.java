package A_Java_Interview_Programs;

public class FindingMissingNumberInAnArray {

    static void findMissingUsingMathematicalFormula(int[] arr){
        int N = arr[arr.length-1];

        int sum = (N*(N+1))/2;
        System.out.println("Mathematical Sum : "+sum);
        int sumOfArray = 0;

        for (int i = 0; i < arr.length; i++) {
            sumOfArray+=arr[i];
        }
        System.out.println("Sum of all number : "+sumOfArray);

        System.out.println("Sum of The actual numbers minus sum of array will give the missing number : "+(sum-sumOfArray));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,7,8,9};
        findMissingUsingMathematicalFormula(array);
    }

}
