package Recursion.Level1;

public class PrintNumberFrom1toN {
    public static void main(String[] args) {
        int n = 5;
        printNum(n);
    }

    private static void printNum(int n) {
        if (n==0) return;
        printNum(n-1);
        System.out.println(n);
    }

}
