public class MultiplicationOfMatrices {
    
    public static void multiplyMatrices(int[][] A,int[][] B){
        int row = A.length;
        int col = B[0].length;

        // Rows of first matrix = column of Second Matrix

        if(A.length!=B[0].length){
            System.out.println("Multiplication Not Possible");
        }

        // New Empty Matrix To Store Multiplied Elements
        int[][] newMatrix = new int[row][col];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    newMatrix[i][j] += A[i][k]*B[k][j];
                }
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {{12,8,4},{3,17,14},{9,8,10}};
        int[][] B = {{5,19,13},{6,15,9},{7,8,16}};

        multiplyMatrices(A,B);
    }
    
}
