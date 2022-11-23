public class NumericPattern_04_Alternate_0_and_1_Triangle {

    private static void alternateZeroOne(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = (i+j);
                if (sum%2==0){
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        alternateZeroOne(5);
    }

}
