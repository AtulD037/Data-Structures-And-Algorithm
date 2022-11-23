public class PrintMatrixElementUsingDifferentTraversal {

    // Printing Matrix row-wise
    public static void rowWisePrint(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }

    public static void rowWiseReversePrint(int[][] matrix){

        for (int i = 0; i < matrix.length; i++)  {
            for (int j = matrix[0].length-1; j >= 0 ; j--) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }

    public static void columnWisePrint(int[][] matrix){

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i]+ " ");
            }
            System.out.println();
        }

    }

    public static void columnWiseReversePrint(int[][] matrix){

        for (int i =  matrix[0].length-1; i >=0; i--) {
            for (int j = matrix.length-1; j >=0 ; j--) {
                System.out.print(matrix[j][i]+ " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        rowWisePrint(matrix);
        System.out.println();

        rowWiseReversePrint(matrix);
        System.out.println();

        columnWisePrint(matrix);
        System.out.println();

        columnWiseReversePrint(matrix);
        System.out.println();
    }

}
