public class DiagonalOfMatrix {

    public static void rowWisePrint(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }

    // Using Two Loops
    public static void diagonalsprint(int[][] matrix){
        System.out.println("Diagonal Elements are");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i==j){
                    System.out.print(matrix[i][j]+ " ");
                }
            }
        }
    }

    // Using only One loop
    public static void dgnlPrint(int[][] matrix){
        System.out.println("Diagonals elements are : ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i]+ " ");
        }
    }

    public static void diagonalsprintWhile(int[][] matrix){
        System.out.println("Diagonal Elements are");
        int row = 0;
        int col = 0;

        while (row< matrix.length){
            System.out.print(matrix[row][col] + "  ");
            row++;
            col++;
        }
    }

    public static void reverseDiagonal(int[][] matrix){
        int j = 0;
        for (int i = matrix.length-1; i >= 0; i--) {
                System.out.print(matrix[i][j]+ " ");
                j++;
            }
        }

    public static void reverseDiagonalUsingWhile(int[][] matrix){
        int row = matrix.length-1;
        int col = 0;
        System.out.println("Reverse Diagonal is : ");
        while (col<matrix.length){
            System.out.print(matrix[row][col]+" ");
            row--;
            col++;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        rowWisePrint(matrix);
        System.out.println();

        diagonalsprint(matrix);
        System.out.println();

        dgnlPrint(matrix);
        System.out.println();

        diagonalsprintWhile(matrix);
        System.out.println();

        reverseDiagonalUsingWhile(matrix);
        System.out.println();

        reverseDiagonal(matrix);
        System.out.println();

    }
}
