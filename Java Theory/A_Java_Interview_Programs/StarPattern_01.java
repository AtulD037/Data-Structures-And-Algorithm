package A_Java_Interview_Programs;

public class StarPattern_01 {

    static void starPrint(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void reverseStarPrint(int n){
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void nachos(int n){
        for (int i = 0; i<n;i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-2; i >=0 ; i--) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starPrint(5);
        System.out.println();
        reverseStarPrint(5);
        System.out.println();
        nachos(5);
    }

}
