public class StarTriangleExact {

    private static void invertedHalfPyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedHalfPyramid(5);
    }

}
