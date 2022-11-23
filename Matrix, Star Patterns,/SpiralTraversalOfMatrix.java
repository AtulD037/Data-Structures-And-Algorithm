public class SpiralTraversalOfMatrix {

    public static void spiralTraversal(int[][] matrix){

        // Print Whole Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        System.out.println();
        }
        int min_row = 0;
        int min_col = 0;
        int max_row = matrix.length-1;
        int max_col = matrix[0].length-1;

       /*
       *  1-2-3-4
       *        |
       *  5-6-7 8
       *  | | | |
       *  0 0 0 0
       *  |     |
       *  1-1-1-1

       * */

        // Top Wall (1-2-3-4)
        System.out.print("Top Wall ");
        for (int i = min_col; i <=max_col ; i++) {
            System.out.print(matrix[min_row][i]+" ");
        }

        System.out.print(" Right Wall ");
        // Right Wall (8-0-1)
        for (int i = min_row+1; i <=max_row ; i++) {
            System.out.print(matrix[i][max_col]+" ");
        }

        // For Bottom Wall (1-1-1)
        System.out.print(" Bottom Wall ");
        for (int i = max_col-1; i >=min_col ; i--) {
            System.out.print(matrix[max_row][i]+ " ");
        }

        System.out.print(" Left Wall ");

        // Left Wall (0-5)
        for (int i = max_row-1; i >min_row ; i--) {
            System.out.print(matrix[i][min_col]+" ");
        }

        // Inner (6-7)
        System.out.print(" Inner Top wall ");
        for (int i = min_col+1; i < max_col; i++) {
            System.out.print(matrix[min_row+1][i]+ " ");
        }
        // Inner left 0
        System.out.print("Inner left ");
        for (int i = max_col-1; i >= min_col+2 ; i--) {
            System.out.print(matrix[max_row-1][i] + " ");
        }
    }

    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{0,0,0,0},{1,1,1,1}};
        spiralTraversal(matrix);
    }

}
