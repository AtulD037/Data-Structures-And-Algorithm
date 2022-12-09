package LinearSearch;

public class LinearSearchForMaximumItemIn2DArray {
    static void maxItem(int[][] array){
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]>maximum){
                    maximum= array[i][j];
                }
            }
        }
        System.out.println(maximum);
    }

    public static void main(String[] args) {
        int[][] array2d = {{1,2,3},{5,6,67,8,9,9},{7,8,9,10}};
        maxItem(array2d);
    }
}
