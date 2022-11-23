public class CheckIdentityMatrix {
    private static void IdMatrix(int[][] matrix){
        boolean flag = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i==j && matrix[i][j]!=1){
                    flag = false;
                    break;
                }
                if(i!=j && matrix[i][j] !=0){
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            System.out.println("Given Matrix is identity Matrix");
        }
        else {
            System.out.println("Given Matrix is not an identity matrix");
        }
    }
}
