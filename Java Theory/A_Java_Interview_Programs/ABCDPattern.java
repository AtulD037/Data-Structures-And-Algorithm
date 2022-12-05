package A_Java_Interview_Programs;

public class ABCDPattern {

    private static void pattern(int n){
        int alpha = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) alpha+" ");
            }
            alpha++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }

}
