public class AdditionOfTwoMatrix {
    public static void addMatrix(int[][] matrix_1,int[][] matrix_2){

        if (matrix_1.length!= matrix_2.length && matrix_1[0].length!=matrix_2.length){
            System.out.println("Rows and columns of matrix are not equal");
        }

        System.out.println("Matrix After Addition");
        for (int i = 0; i < matrix_1.length; i++) {
            for (int j = 0; j < matrix_1[0].length; j++) {
                System.out.print(matrix_1[i][j]+matrix_2[i][j]+ " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix_1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] matrix_2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        addMatrix(matrix_1,matrix_2);


    }
}
