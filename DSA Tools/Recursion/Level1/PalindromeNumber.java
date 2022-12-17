package Recursion.Level1;

public class PalindromeNumber {

    public static void main(String[] args) {
        int n = 1111;
        rev(n);
        System.out.println(n==sum);
    }

    static int sum = 0;
    private static void rev(int n) {
        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        rev(n/10);

    }

}
