package LinearSearch;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] array2D = {{1,2,3},{5,6},{7,8,9,10}};
        int[][] array2d = {{1,2,3},{5,6,67,8,9,9},{7,8,9,10}};

        search(array2D,10);
        System.out.println();
        search(array2d,9);
    }

    static void search(int[][] array,int key){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]==key){
                    System.out.println("Element is present");
                }
            }
        }
    }
}
