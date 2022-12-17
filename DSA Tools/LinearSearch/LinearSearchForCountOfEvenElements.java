package LinearSearch;

public class LinearSearchForCountOfEvenElements {

    static void evenNumber(int[] array){
        int count = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] array = {12,2,45,67,89,32,22};
        evenNumber(array);
    }

}
