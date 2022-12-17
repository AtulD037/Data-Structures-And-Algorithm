package String;

public class Pattern {

    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            // For every row run the column
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when one row is printed add a new line
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            // For every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed add a new line
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            // For every row run the column
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            // when one row is printed add a new line
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
        int num =1;
            // For every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print(num);
                num++;
            }
            // when one row is printed add a new line
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            // when one row is printed add a new line
            System.out.println();
        }
    }static void pattern6(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int numberOfSpaces = n - totalColsInRow;
            for (int s = 0; s < numberOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            // when one row is printed add a new line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);

    }
}
