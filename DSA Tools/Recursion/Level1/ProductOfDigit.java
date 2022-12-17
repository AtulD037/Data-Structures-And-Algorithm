package Recursion.Level1;

public class ProductOfDigit {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(productOfDigit(n));
    }

    private static int productOfDigit(int n) {
        if (n==0){
            return 1;
        }
        return (n%10)*productOfDigit(n/10);
    }
}
